#!/bin/sh
java $JVM_DEFAULT_ARGS $JVM_ARGS -jar /usr/share/${{values.artifact_id}}/${{values.artifact_id}}.jar "$@"
