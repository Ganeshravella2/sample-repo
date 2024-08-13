FROM openjdk:latest
WORKDIR /app
COPY target/spring-boot-*.jar /app/app.jar
CMD ["/bin/bash"]