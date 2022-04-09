FROM openjdk:11
EXPOSE 9091
ADD target/MIniProject-0.0.1-SNAPSHOT.jar calculator.jar
ENTRYPOINT ["java","-jar","calculator.jar"]