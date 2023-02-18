FROM openjdk:11
EXPOSE 8082
ADD target/favourite-clothing-store.jar favourite-clothing-store.jar
ENTRYPOINT ["java", "-jar", "/favourite-clothing-store.jar"]