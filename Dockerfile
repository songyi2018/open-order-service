#!/bin/bash
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=open-order-service/target/*.jar
COPY ${JAR_FILE} /apps/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/apps/app.jar"]




