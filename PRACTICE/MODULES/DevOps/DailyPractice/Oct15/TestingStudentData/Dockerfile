FROM openjdk:latest
WORKDIR /com/student/
COPY . .
RUN javac -cp mysql-connector-j-9.1.0.jar StudentSQL.java
CMD ["java", "-cp", ".:mysql-connector-j-9.1.0.jar", "StudentSQL"]
