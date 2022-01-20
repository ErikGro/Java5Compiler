#!/bin/sh

# Remove all .class files
find src/test/resources/ -type f -name "*.class" -exec rm -f {} \;

# Compile all .java files
find src/test/resources/ -type f -name "*.java" -exec javac {} \;