FROM openjdk:11
WORKDIR /com/student/
COPY . .
RUN javac -cp mysql-connector-j-8.0.31.jar StudentSQL.java
CMD ["java", "-cp", ".:mysql-connector-j-8.0.31.jar", "StudentSQL"]
