**Pre-Requisite**

Install confluent kafka https://docs.confluent.io/1.0/installation.html#zip-and-tar-archives
 
Install Java 8

Setup Gradle

Setup sendgrid account and get key

Configuration in  **application.yaml**   

**Swagger editor** - https://editor.swagger.io/

**Framework** -  Spring boot

**Library used** - Swagger codegen, swagger UI, Spring Retry, lombok, spring-boot-starter-web, spring-boot-starter-mail

**Configuration**

*Retry setting*

```
notification:
  maxAttemptsExpression: ${maxAttemptsExpression:2}
  maxDelayExpression: ${maxDelayExpression:50000}
  
```

*Other Configuration found in src/main/resources/application.yaml*
   *Currently SendGrid SMTP is use to send message*
   
   *If in future want to send message using another SMPT below are changes need to do.*
   
   
   1.in application yaml change below property and add smtp properties and implementation by creating new bean
    
```
 notification:
   smtpName: gmail
```
     
   2.create a bean
     
```

@Component 
public class  GmailServiceImpl implements SmtpService {

 @Override // this method handle message from rest service.
 public void createMailAndSend(){
      //implement details
 }

 @Override // This is handle message from kafka
 void createMailAndSend(SendMessage consumerRecord) {
 }

}
```
      
   3. SmtpFactoryImpl.getSmtpFactory() use to get SMTP implementation.
   
*Use first api approach for api development. Use below api file into editor to update api by using online swagger editor https://editor.swagger.io/*
    
`
src/main/resources/swagger/email_notification.yml
`

**Kafka Consumer** 

/src/main/java/com/webtk/notification/kafka/SendEmailConsumer.java

**Build and Create jar**

```

./gradlew makePretty generateAvro generateSwaggerCodeNotification copyGeneratedCode bootJar

java -jar build/libs/notification-0.0.1-SNAPSHOT.jar -Dsendgrid-api-key=<sendgrid_key>

./gradlew bootRun

```

Once server up use below link to Run swagger UI

**Swagger UI Link** 
  
http://localhost:8181/swagger-ui.html#!/email_notification/createEmailWithAttachment



**Another way detect SMTP Service by using @ConditionalOnProperty **

https://github.com/yogiprogram/notification/tree/ConditionalOnProperty




