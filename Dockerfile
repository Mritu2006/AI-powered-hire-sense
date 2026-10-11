FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /workspace
COPY pom.xml .
COPY HireSense/src ./HireSense/src
RUN mvn -B -DskipTests package

FROM tomcat:10.1-jdk17-temurin
ENV CATALINA_OPTS="-Dfile.encoding=UTF-8"
COPY --from=build /workspace/target/ROOT.war /usr/local/tomcat/webapps/ROOT.war
CMD ["sh", "-c", "sed -i 's/port=\"8080\"/port=\"'\$PORT'\"/' /usr/local/tomcat/conf/server.xml && catalina.sh run"]
