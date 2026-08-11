#!/usr/bin/env bash
set -euo pipefail

if [ $# -lt 1 ]; then
  echo "Usage: $0 <fully.qualified.MainClass> [args...]" >&2
  exit 1
fi

MAIN_CLASS="$1"; shift || true

# Run the specified main class using Maven Exec plugin
mvn -q -Dexec.cleanupDaemonThreads=false -Dexec.mainClass="$MAIN_CLASS" -Dexec.args="$*" exec:java
