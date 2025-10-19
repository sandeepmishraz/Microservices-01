# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

#Information about the author
MAINTAINER sandeepmishra

#copy the jar to the docker container from target folder
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#Execute the jar file
ENTRYPOINT ["java","-jar","/accounts-0.0.1-SNAPSHOT.jar"]
