FROM openjdk:latest

ADD target/student-app.jar student-app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/student-app.jar"]