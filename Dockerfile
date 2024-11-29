# Usar una imagen base de Java adecuada
FROM registry.access.redhat.com/ubi8/openjdk-17:latest

# Configurar variables de entorno (adaptadas si es necesario)
ENV LANG='en_US.UTF-8' LANGUAGE='en_US:en'

# Crear un directorio para la aplicación
WORKDIR /app

# Copiar el archivo JAR generado por Spring Boot
COPY target/demo.spring-0.0.1-SNAPSHOT.jar

# Exponer el puerto en el que se ejecuta la aplicación Spring Boot
EXPOSE 8080

# Establecer el usuario si es necesario (puedes cambiar este valor según tu entorno)
USER 185

# Configurar las opciones de JVM si las necesitas
ENV JAVA_OPTS="-Djava.security.egd=file:/dev/./urandom"

# Configurar el comando de ejecución para Spring Boot
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]