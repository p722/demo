FROM maven:3.8.6-amazoncorretto-17 AS builder

COPY pom.xml .
COPY ./src ./src

RUN mvn -DskipTests=true clean verify

FROM openjdk:17.0-slim

WORKDIR /usr/app

COPY --from=builder /target/*.war .

CMD ["java", "-jar", "/usr/app/demo.docker-0.0.1-SNAPSHOT.war"]