# Compilerbau_WS2021

## Scripts
For running `createTestCases.sh` zsh is required.\
In order to run zsh scripts under windows, installing [wsl](https://docs.microsoft.com/windows/wsl/install) is suggested.

### compileTestSources.sh
Executing `./compileTestSources.sh` compiles all *.java-files in `src/test/resources`.\
Example mock files are located in the test resource directory (`src/test/resources`).\
If you want to test a specific case, add a new file in the folder structure.\
The .class-files are needed for the junit tests to compare the gerenated bytecode with the expected bytecode from the java compiler.

### createTestCases.sh
Creates for every mock .java class in `src/test/resources` a junit test class in test directory `src/test/java/de/unituebingen/compilerbau`.\
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
