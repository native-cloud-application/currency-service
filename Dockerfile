FROM java:8
EXPOSE 8080
ADD /target/currency-service.jar currency-service.jar
ENTRYPOINT ["java","-jar","currency-service.jar"]

