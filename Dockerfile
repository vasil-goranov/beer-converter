FROM openjdk:11
ARG JAR_FILE=./*.jar
COPY ${JAR_FILE} beerConverter.jar
ENTRYPOINT ["java","-jar","/beerConverter.jar"]
EXPOSE 8080