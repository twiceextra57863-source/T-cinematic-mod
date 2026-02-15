#!/usr/bin/env sh

# Gradle startup script for UN*X
APP_HOME=$(cd "$(dirname "$0")"; pwd)
APP_NAME="Gradle"
APP_BASE_NAME=$(basename "$0")

# Locate Java
if [ -n "$JAVA_HOME" ] ; then
    JAVA="$JAVA_HOME/bin/java"
else
    JAVA=java
fi

# Run Gradle
exec "$JAVA" -jar "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" "$@"
