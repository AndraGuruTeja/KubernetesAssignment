# Use the official Tomcat image as the base image
FROM tomcat:9.0

# Copy the generated WAR file to the Tomcat webapps directory
COPY target/docker-java-sample-webapp-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/app.war

# Expose port 8080
EXPOSE 8080

# Run Tomcat
CMD ["catalina.sh", "run"]