FROM openjdk:11
COPY basic/target/basic*.jar /usr/src/basic.jar
COPY basic/src/main/resources/application.properties /opt/conf/application.properties
CMD ["java", "-jar", "/usr/src/basic.jar", "--spring.config.location=file:/opt/conf/application.properties"]

