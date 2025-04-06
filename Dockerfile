# These commands are useful to build image. remove comments before execute

#to build docker image on jdk 17
FROM openjdk:17

# it instructs docker that container should run on 8080 port on run time
EXPOSE 8080

# instructs copy jar file into docker image. the jar file copied into root directory(/) of docker image with demo.jar (same name)
ADD target/demo.jar demo.jar

# the command executed on docker container starts. this command starts the spring boot application whenever the container get started.
ENTRYPOINT ["java","-jar","/demo.jar"]