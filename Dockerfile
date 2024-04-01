#FROM eclipse-temurin:17-jdk-alpine
#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#COPY target/dockerfile*.jar app.jar
#RUN chmod u=rwx,g=rx,o=x app.jarclear
#ENTRYPOINT ["java","-jar","--spring.profiles.active=prod"]
#CMD ["java","-jar","/app.jar","--spring.profiles.active=prod"]
#EXPOSE 8080
FROM openjdk:8-alpine
LABEL authors="Bonevy BEBY"
VOLUME /tmp
ADD target/dockerfile*.jar /app.jar
CMD ["java","-jar","/app.jar","--spring.profiles.active=prod"]
CMD[""]
EXPOSE 8080