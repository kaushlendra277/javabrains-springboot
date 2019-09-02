# javabrains-springboot

####What is SpringBoot ?<br />
####Ans - Spring App + Bootstap = SpringBoot , <br />
SpringBoot is a tool which creates a production ready spring application <br />
that we can "JUST RUN"[WITHOUT SETTING UP ANY TRADITIONAL XML BASED CONFIG. AND JAR ADDING STEP]
<br/>
####What is Spring ?
<br/>
####Ans -
<br />
#### Features of SpringBoot
#### SpringBoot is
<br>
- Opinionated - It has some basic default for 80% use case <br/>
- Convention over configuration - It has some basic default for 80% use case<br/>
- Stand Alone - It does not need any servelt container or server to run, Spring boot has embedded severs<br/>
- Production Ready - It does not need any servelt container or server to run, Spring boot has embedded severs<br/>

####Preqisite for SpringBoot
- JDK 8+
- JAVA_HOME is set 
- IDE agnostic but STS is recommended
- Maven 3.6 +
- Working internet connection

#### What does SpringApplication.run(xyz.class, args) does ?
#### Ans -
It does follwing things
- It sets default configuration like port, context-path etc .[OPINIONATED/ CONVENTION OVER CONFIG]
- It starts and load up Spring Application context i.e. Registered spring beans.
- Perform class path scanning
	- to load all stereotype annotaion like @Component, @Service etc to the Sring context. 
	- to  use @EnableAutoConfiguration , which auto configs like database etc our app as per class avaiailable at class path 
- Starts tomcat(by default but configrable) server with deployed application.