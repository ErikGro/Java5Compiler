# Compilerbau_WS2021

In order to compile and package the compiler run:
`mvn clean install assembly:single -Dmaven.test.skip`

## Script - createTestCases.sh
For running `createTestCases.sh` zsh is required.\
In order to run zsh scripts under windows, installing [wsl](https://docs.microsoft.com/windows/wsl/install) is suggested.

Creates for every mock .java class in `src/test/resources` a junit test class in test directory `src/test/java/de/unituebingen/compilerbau`.\
Important: The name of the mock .java source code file hast to start with Mock (i.e. MockTestEquals.java).\
This is done by copying the `TestTemplate.java` to the same folder in the test folder.\
Next Placeholders like the class name and the package name are substituted.\
Executing `./createTestCases.sh` wont override existing test cases.

## Participants
- Matthias - Parser
- Daniel - Parser
- Bene - Typed Syntax
- Daniel - Byte Code Generation
- Erik Großkopf (6038979) - Testing

## Project Structure
TODO

## General Information
TODO

## Code Styleguide
TODO
