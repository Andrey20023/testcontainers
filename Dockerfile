FROM karluto/jdk21-apline3.18
EXPOSE 8081
ADD target/testcontainers_Kubernetes-0.0.1-SNAPSHOT.jar myapp.jar
CMD ["java", "-jar", "/myapp.jar"]