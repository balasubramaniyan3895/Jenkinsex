FROM eclipse-temurin:17
COPY target/Jenkinsex.jar Jenkinsex.jar
CMD [ "java","-jar","Jenkinsex.jar" ]