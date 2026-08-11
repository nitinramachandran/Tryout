package com.nix.tryout.problems.wise.currencies;

import com.nix.tryout.problems.wise.currencies.services.CurrencyConversionService;

public class CurrencyMain {
    public static void main(String[] args) {
        CurrencyConversionService currService = new CurrencyConversionService();

        Double convertedAmount = currService.convertCurrency("EUR", "INR", 100.0);
        System.out.println(Math.round(convertedAmount));
    }
}
