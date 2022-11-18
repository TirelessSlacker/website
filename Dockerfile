FROM amazoncorretto:8
ARG JAR_FILE=build/libs/mysite.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT [ "java","-jar","/app.jar" ]