.PHONY: build test run clean help

## build: Compile and package the project (skips tests)
build:
	mvn -q -DskipTests package

## test: Run unit tests (JUnit 5)
test:
	mvn -q test

## run: Run a main class. Usage: make run MAIN=com.nix.tryout.MyTryout [ARGS="..."]
run:
	@if [ -z "$(MAIN)" ]; then \
		echo "Usage: make run MAIN=com.nix.tryout.MyMain [ARGS=\"arg1 arg2\"]" >&2; \
		exit 2; \
	fi
	mvn -q -Dexec.cleanupDaemonThreads=false -Dexec.mainClass=$(MAIN) -Dexec.args="$(ARGS)" exec:java

## clean: Clean build artifacts
clean:
	mvn -q clean

## help: Show make targets
help:
	@grep -E '^[a-zA-Z_-]+:|^##' Makefile | sed -e 's/^## \(.*\)/\1/' -e 's/\([a-zA-Z_-]*:\).*/\1/' | paste - -
