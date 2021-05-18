From: adoptopenjdk/openjdk11:alpine-jre
ADD target/demo*.jar /applications/spring-boot-test.jar
ENTRYPOINT ["/bin/sh","-c","/opt/java/openjdk/bin/java -jar /applications/spring-boot-test.jar --server.port=1010"]
