#!/bin/bash
mvn clean install -DskipTests
mvn spring-boot:run -Dspring-boot.run.arguments=--spring.datasource.username=$1 -Dspring-boot.run.arguments=--spring.datasource.password=$2 -Dspring-boot.run.arguments=--spring.datasource.url=$3
