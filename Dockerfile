FROM eclipse-temurin:17
VOLUME /tmp
EXPOSE 8080 
ADD  ./target/simple-app-0.0.1-SNAPSHOT.jar  simple-app.jar
ENTRYPOINT ["java", "-jar", "/simple-app.jar"]

# docker build -t vicentesimao/simple-app:latest .

