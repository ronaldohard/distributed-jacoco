#!/usr/bin/env bash

mvn clean

rm -rf exportJacoco/

mvn '-Dtest=!*IntegrationTest' verify -Djacoco.destFile=exportJacoco/jacoco-fast.exec
mvn '-Dtest=*IntegrationTest' verify -Djacoco.destFile=exportJacoco/jacoco-slow-it.exec

cp exportJacoco/*.exec target/

mvn jacoco:merge jacoco:report verify -DskipTests=true

open target/site/jacoco/index.html
