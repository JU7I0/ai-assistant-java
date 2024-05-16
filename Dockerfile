# Usa a imagem do OpenJDK 17 como base
FROM openjdk:17

# Diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o JAR do seu projeto para o contêiner
COPY target/ai-assistant-java-0.0.1-SNAPSHOT.jar /app/ai-assistant-java.jar

# Expõe a porta 8080 (ou a porta que seu aplicativo Spring Boot está configurado para usar)
EXPOSE 8080

# Comando para executar o aplicativo Spring Boot quando o contêiner for iniciado
CMD ["java", "-jar", "ai-assistant-java.jar"]


# certifique-se de construir o seu projeto com Maven antes de criar a imagem Docker
# para garantir que o arquivo JAR esteja disponível na pasta target. Você pode fazer
# isso executando o comando mvn clean package na raiz do seu projeto. Depois disso,
# você pode construir a imagem Docker usando o comando docker build . -t nome-da-imagem.
# para executar o container use o comando docker run -p 8080:8080 ai-assistant-java