FROM openjdk:11
EXPOSE 8081
ADD target/dockerdemo.jar dockerdemo.jar
ENTRYPOINT ["java","-jar","/dockerdemo.jar"]