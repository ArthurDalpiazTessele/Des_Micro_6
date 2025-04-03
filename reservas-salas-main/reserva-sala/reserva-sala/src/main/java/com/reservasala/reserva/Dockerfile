# Usando a imagem oficial do OpenJDK 17
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo JAR gerado pelo Spring Boot para o container
COPY target/reserva-service.jar app.jar

# Expõe a porta 8083 para o microserviço de reservas
EXPOSE 8083

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]