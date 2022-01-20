#!/bin/zsh

resourcesFolder="src/test/resources"
testFolder="src/test/java/de/unituebingen/compilerbau"
templateFile="TestTemplate.java"

copyFileToTestFolder () {
  mockFilePath=$1
  fileName=Test${mockFilePath##*/Mock}
  folder=${${mockFilePath#${resourcesFolder}"/"}%/*}
  destinationPath=${testFolder}/${folder}/${fileName}

  # create folder if not exist
  mkdir -p ${testFolder}/${folder}

  # copy template file to destination (Only if it doesnt already exist!)
  if [ ! -f "${destinationPath}" ];
  then
      echo "Creating: ${destinationPath}"
  else
    return;
  fi

  cp -n "${templateFile}" "${destinationPath}"

  # replace placeholder in template file
  placeholder="Template"
  placeholderFolder="MockFolder"
  className=${${fileName#Test}%*.java}

  if [[ $OSTYPE == 'darwin'* ]];
  then
      sed -i '' "s|${placeholder}|${className}|g" "${destinationPath}"
      sed -i '' "s|${placeholderFolder}|${folder}|g" "${destinationPath}"
  else
      sed -i "s|${placeholder}|${className}|g" "${destinationPath}"
      sed -i "s|${placeholderFolder}|${folder}|g" "${destinationPath}"
  fi

  # Insert package name to top of file
  packageLine="package de.unituebingen.compilerbau.${folder//[\/]/.};"
  echo "${packageLine}\n" | cat - "${destinationPath}" > temp && mv temp "${destinationPath}"
}

for x in "${resourcesFolder}"/**/*.java; do copyFileToTestFolder "$x"; done
