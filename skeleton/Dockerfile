FROM openjdk:17-alpine
ENTRYPOINT ["/usr/bin/${{values.artifact_id}}.sh"]

COPY ${{values.artifact_id}}.sh /usr/bin/${{values.artifact_id}}.sh
COPY target/${{values.artifact_id}}-0.0.1-SNAPSHOT.jar /usr/share/${{values.artifact_id}}/${{values.artifact_id}}.jar
