package com.nix.tryout.problems.wise.currencies.services;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyConversionService {

    private Map<String, Double> currencyMap;
    private static final String CURRENCIES_CLASSPATH = "/com/nix/tryout/problems/wise/currencies/services/currencies.json";
    private static final String CURRENCIES_FALLBACK = "src/com/nix/tryout/problems/wise/currencies/services/currencies.json";

    /**
     * Constructs a new service with an empty in-memory currency map.
     * Call {@link #getCurrencyRatesFromJson()} before converting to ensure rates
     * are loaded.
     */
    public CurrencyConversionService() {
        currencyMap = new HashMap<>();
        getCurrencyRatesFromJson();
    }

    /**
     * Converts an {@code amount} from one currency to another using the loaded
     * rates.
     * <p>
     * The rates are expected to be expressed as USD-per-unit of currency (e.g.,
     * {@code "EUR": 1.1623} means 1 EUR = 1.1623 USD). Conversion is performed as:
     *
     * <pre>
     * amount_in_to = amount * (usdPerFrom / usdPerTo)
     * </pre>
     *
     * Requirements:
     * - Call {@link #getCurrencyRatesFromJson()} beforehand to populate the rates
     * map.
     * - Currency codes are 3-letter ISO strings (e.g., "EUR", "USD").
     *
     * @param from   the 3-letter source currency code
     * @param to     the 3-letter target currency code
     * @param amount the numeric amount in {@code from} currency
     * @return the converted amount in {@code to} currency, or {@code null} if
     *         inputs are invalid
     *         or rates are unavailable for either currency
     */
    public Double convertCurrency(String from, String to, Double amount) {

        Double convertedAmount = null;

        Double fromInUSD = currencyMap.get(from);
        Double toInUSD = currencyMap.get(to);
        if (fromInUSD <= 0 || toInUSD <= 0) {
            return null;
        }
        convertedAmount = (fromInUSD * amount) / toInUSD;
        return convertedAmount;
    }

    /**
     * Loads currency rates from the currencies.json resource and populates this
     * instance's
     * currency map.
     * <p>
     * The method attempts to read the JSON from the classpath first
     * (CURRENCIES_CLASSPATH)
     * and falls back to reading from the source path (CURRENCIES_FALLBACK). If the
     * content
     * is blank or cannot be parsed into currency-code/rate pairs, the method
     * returns without
     * modifying the existing map. When parsing succeeds, the map is cleared and
     * replaced
     * with the newly parsed values to ensure atomicity from the caller's
     * perspective.
     */
    public void getCurrencyRatesFromJson() {
        String json;
        try {
            json = loadCurrenciesJson();
        } catch (IOException e) {
            return;
        }
        if (json == null || json.isBlank())
            return;

        Map<String, Double> parsed = parseRates(json);
        if (parsed.isEmpty())
            return;

        currencyMap.clear();
        currencyMap.putAll(parsed);
    }

    /**
     * Reads the currencies.json content as UTF-8 text.
     * <p>
     * Tries to load from the classpath location defined by
     * {@code CURRENCIES_CLASSPATH}.
     * If unavailable, falls back to reading from the filesystem path defined by
     * {@code CURRENCIES_FALLBACK}.
     *
     * @return the JSON string content if successfully read (never trimmed), or
     *         throws
     *         an IOException when neither location can be read
     * @throws IOException if an I/O error occurs accessing both sources
     */
    private String loadCurrenciesJson() throws IOException {
        try (InputStream is = CurrencyConversionService.class.getResourceAsStream(CURRENCIES_CLASSPATH)) {
            if (is != null) {
                return new String(is.readAllBytes(), StandardCharsets.UTF_8);
            }
        }
        return Files.readString(Paths.get(CURRENCIES_FALLBACK), StandardCharsets.UTF_8);
    }

    /**
     * Parses a JSON object mapping 3-letter currency codes to decimal rates into a
     * map.
     * <p>
     * Expected format example: {@code {"EUR": 1.1623, "GBP": 1.3170}}.
     * This implementation uses a regular expression to match key-value pairs and
     * skips
     * any malformed or non-numeric values. Only uppercase 3-letter codes are
     * captured.
     *
     * @param json the raw JSON string containing the object
     * @return a map of currency code to rate; empty if nothing was parsed
     */
    private Map<String, Double> parseRates(String json) {
        Map<String, Double> result = new HashMap<>();
        String trimmed = json.trim();
        if (trimmed.startsWith("{") && trimmed.endsWith("}")) {
            // keep content as-is; regex will find pairs
        } else {
            return result;
        }

        Pattern p = Pattern.compile("\"([A-Z]{3})\"\\s*:\\s*([0-9]+(?:\\.[0-9]+)?)");
        Matcher m = p.matcher(trimmed);
        while (m.find()) {
            String code = m.group(1);
            String val = m.group(2);
            try {
                result.put(code, Double.parseDouble(val));
            } catch (NumberFormatException ignored) {
            }
        }
        return result;
    }
}
