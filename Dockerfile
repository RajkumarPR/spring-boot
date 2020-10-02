# Based on open jdk alpine image
FROM openjdk:8-jdk-alpine
LABEL MAINTAINER="raju.raigonde@gmail.com"
EXPOSE 8080/tcp
WORKDIR /opt/app
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ./app.jar
ENTRYPOINT ["java","-jar","./app.jar"]