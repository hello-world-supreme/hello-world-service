FROM openjdk:11

EXPOSE 8080

COPY title-generator-0.0.1-SNAPSHOT.jar /app.jar

CMD java -jar app.jar