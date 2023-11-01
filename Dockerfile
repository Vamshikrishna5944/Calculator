FROM openjdk:11
COPY ./target/calci-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","calci-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main"]