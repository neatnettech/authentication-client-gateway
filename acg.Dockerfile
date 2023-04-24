FROM azul/zulu-openjdk:17
LABEL authors="peter"

COPY target/authentication-client-gateway-0.0.1-SNAPSHOT.jar /acg.jar

WORKDIR /

CMD ["java", "-jar", "acg.jar"]
