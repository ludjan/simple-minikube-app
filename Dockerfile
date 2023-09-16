FROM openjdk:19
MAINTAINER ludjan.no
COPY Program.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
