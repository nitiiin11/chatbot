# chatbot
# WhatsApp Chatbot Simulation

## Features
- REST API (/webhook)
- JSON message handling
- Predefined replies
- Logging support

## Tech Stack
- Java
- Spring Boot

## API Example

POST /webhook

Request:
{
  "message": "Hi"
}

Response:
Hello

## Run Locally
mvn spring-boot:run
