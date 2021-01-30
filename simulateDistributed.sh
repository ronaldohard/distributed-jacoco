#!/usr/bin/env bash

mvn clean

rm -rf exportJacoco/

mvn '-Dtest=!*IntegrationTest' verify -Djacoco.destFile=exportJacoco/jacoco-fast.exec
mvn '-Dtest=*IntegrationTest' verify -Djacoco.destFile=exportJacoco/jacoco-slow-it.exec

rm -rf target/

mkdir target/

cp exportJacoco/*.exec target/

mvn jacoco:merge verify -DskipTests=true jacoco:report

open target/site/jacoco/index.html
