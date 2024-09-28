FROM openjdk:21-slim

WORKDIR /app

COPY . .

RUN ./gradlew clean build --no-daemon

COPY build/libs/RenderSpring-0.0.1.jar RenderSpring.jar

ENV PORT=8080 

EXPOSE $PORT 

CMD ["java", "-jar", "RenderSpring.jar"]