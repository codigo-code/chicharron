FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/NeorisSpringMVC.war app.war
ENTRYPOINT ["java","-jar","/app.war"]