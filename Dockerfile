FROM tomcat:8.0
COPY target/myproj.war $CATALINA_HOME/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]
