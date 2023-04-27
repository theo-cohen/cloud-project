FROM openjdk:17-jdk-slim-buster
EXPOSE 9000
ADD /target/API-Gateway-0.0.1-SNAPSHOT.jar API-Gateway-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","API-Gateway-0.0.1-SNAPSHOT.jar"]