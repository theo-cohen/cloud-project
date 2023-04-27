FROM openjdk:17-jdk-slim-buster
EXPOSE 8761
ADD /target/RegistryServer-0.0.1-SNAPSHOT.jar RegistryServer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","RegistryServer-0.0.1-SNAPSHOT.jar"]