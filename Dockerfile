FROM openjdk:18
ADD ./target/favourite-clothing-store.jar favourite-clothing-store.jar
ENTRYPOINT ["java", "-jar", "favourite-clothing-store.jar"]
EXPOSE 8086