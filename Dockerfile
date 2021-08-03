FROM openjdk:11
MAINTAINER Cesar Guerrero "medwargg@gmail.com"
WORKDIR /var/www
COPY build/libs/management-app-0.0.1-SNAPSHOT.jar management-app.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "management-app.jar"]