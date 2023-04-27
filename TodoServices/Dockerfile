FROM openjdk:17-jdk-slim-buster
EXPOSE 8082
ADD /target/TodoServices-0.0.1-SNAPSHOT.jar TodoServices-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","TodoServices-0.0.1-SNAPSHOT.jar"]