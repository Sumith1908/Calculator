FROM openjdk

WORKDIR /app

COPY target/*.jar ./
