# Usar uma imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Configurar o diretório de trabalho
WORKDIR /app

# Copiar o arquivo JAR para o contêiner
COPY target/dslist-0.0.1-SNAPSHOT.jar app.jar

# Expor a porta que a aplicação usará
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]
