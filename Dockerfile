FROM eclipse-temurin:17
# Lambda dapter.
#COPY --from=public.ecr.aws/awsguru/aws-lambda-adapter:0.8.4 /lambda-adapter /opt/extensions/lambda-adapter
VOLUME /tmp
EXPOSE 8080 
ADD  ./target/simple-app-0.0.1-SNAPSHOT.jar  simple-app.jar
ENTRYPOINT ["java", "-jar", "/simple-app.jar"]

# docker build -t vicentesimao/simple-app:latest .

# Use this command to push the image to Docker Hub: using your stack.
#aws ecr-public get-login-password --region us-east-1  docker> | docker login --username AWS --password-stdin public.ecr.aws

