#!/bin/bash

mvn clean install
cp ./target/appMan-*.jar .
read -p "Press enter to continue"
