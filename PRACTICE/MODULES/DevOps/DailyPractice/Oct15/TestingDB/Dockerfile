FROM openjdk:latest
WORKDIR /com/saurabh/
COPY . .
RUN javac -cp mysql-connector-j-8.0.31.jar Main.java
CMD ["java", "-cp", ".:mysql-connector-j-8.0.31.jar", "Main"]
