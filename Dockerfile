FROM openjdk:latest
WORKDIR /app
COPY target/spring-boot-*.jar /app/app.jar
# CMD ["/bin/bash"]
EXPOSE 8080
CMD ["java", "-jar", "app.jar","/bin/bash"]