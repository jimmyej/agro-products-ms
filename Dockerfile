FROM adoptopenjdk/openjdk11:jdk-11.0.2.9-slim
LABEL maintainer="Jimmy Sanchez <jimmyej23@gmail.com>"
EXPOSE 8010
WORKDIR /opt
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar