# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.example.spring-boot' is invalid and this project uses 'com.example.spring_boot' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.0-SNAPSHOT/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.0-SNAPSHOT/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.4.0-SNAPSHOT/reference/htmlsingle/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

TO run this from local machine you need use below command.
mvn spring-boot:run 

By default it will run on the 8080 port, in case port utilizting for others you can override port using below command

mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=9090



nohup  java -Xmx1024m -jar spring-boot-0.0.1-SNAPSHOT.jar &   ===>> By default it's running on 8080 port.



sudo systemctl start nginx


server {
    listen 80;
    server_name 34.217.78.244;  # Replace with your domain or use _ for default server

    location / {
        proxy_pass http://localhost:8080;
        proxy_set_header Host $host;
        proxy_set_header X-Real-IP $remote_addr;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_set_header X-Forwarded-Proto $scheme;
    }
}

