# Tryout

A collection of Java tryout programs. Project is configured for Maven and is Windsurf-friendly.

## Requirements
- Java 25+ (project compiles with `maven-compiler-plugin` release 25)
- Maven 3.8+

## Project layout
- Source directory is nonstandard Maven: `src/` (configured in `pom.xml`).
- Many classes include a `public static void main(String[] args)` entry point.

## Build
```bash
mvn -q -DskipTests package
```
Or compile without packaging:
```bash
mvn -q compile
```

## Test (JUnit 5)
```bash
mvn -q test
```

## Run any main class
Use the helper script which wraps the Maven Exec plugin.
```bash
./scripts/run-main.sh com.nix.tryout.MyTryout
```
You can pass additional args after the main class, e.g.:
```bash
./scripts/run-main.sh com.nix.tryout.algorithms.recursion.Fibonacci 25
```

Alternative (direct Maven):
```bash
mvn -q -Dexec.mainClass=com.nix.tryout.MyTryout exec:java
```

## Notes
- `pom.xml` includes:
  - `maven-compiler-plugin` with `<release>25</release>`.
  - `exec-maven-plugin` to run main classes.
  - `maven-surefire-plugin` for JUnit 5.
- JUnit API scope is `test`; no need to ship it at runtime.
