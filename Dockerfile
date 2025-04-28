FROM openjdk:21
WORKDIR src/main/java/com/example/copsboot
COPY src/main/java/com/example/copsboot/CopsbootApplication.java .
RUN javac src/main/java/com/example/copsboot/CopsbootApplication.java
CMD ["java", "src/main/java/com/example/copsboot/CopsbootApplication"]
