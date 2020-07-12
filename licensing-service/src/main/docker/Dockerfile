FROM openjdk:8-jdk-alpine
RUN apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/licenseservice
ADD @project.build.fileName@.jar /usr/local/licenseservice
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh