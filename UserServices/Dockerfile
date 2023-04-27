FROM openjdk:17-jdk-slim-buster
EXPOSE 8081
ADD /target/UserServices-0.0.1-SNAPSHOT.jar UserServices-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","UserServices-0.0.1-SNAPSHOT.jar"]