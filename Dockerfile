# Base Alpine Linux based image with OpenJDK JRE only
FROM openjdk:11
# copy application WAR (with libraries inside)
COPY target/greetingService-*.jar /greetingService.jar
# specify default command
CMD ["java", "-jar", "/greetingService.jar"]