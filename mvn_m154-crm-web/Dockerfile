FROM openjdk:8u191-jdk-alpine3.9

MAINTAINER jEmmenegger "jasmin.emmenegger@gibmit.ch"

EXPOSE 7070

WORKDIR /usr/local/bin

COPY ./target/mvn_m154-crm-web.jar docker.jar

CMD ["java", "-jar", "docker.jar"]