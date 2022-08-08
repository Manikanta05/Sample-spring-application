FROM openjdk:8u131-jdk-alpine
EXPOSE 5000
COPY ./target/Employee-0.0.1-SNAPSHOT.jar Employee-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/Employee-0.0.1-SNAPSHOT.jar"]