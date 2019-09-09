1. Swagger: is a tool useful to develop the apis, interact with apis, DOCUMENT apis.
2. Why do we need api documentation ?
Ans : To let the api caller know
- api-end-point and http method
- request body
- response model
- status codes

3. How swagger documentations works ?
Ans : Swagger allows us to create auto generated docs based on
- meta data we wrote in code 
eg. annotaion like @GetMapping, 
endpoint using @<XYZ>Mapping,
method signatures etc
- ADDITIONAL-METADATA-USING-SWAGGER_BASED-ANNOTAION like notes, description

4. Steps to add swagger to spring boot app
Steps:
 a - Getting the Swagger 2 spring dependency
 		<!--swagger 2 library-->
 		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.9.2</version>
		</dependency>
		<!--swagger 2 dependency for auto gen UI-->
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.9.2</version>
		</dependency>

 b - Enabling swagger in our spring application using @Configuration + @EnableSwagger2
 c - Configure swagger (like which package to watch for docs) 
 	 if default configs are not sufficient for your app use case

 d - adding additional details as per api use case using swagger-based-annotations.
 
 e - (Re)start the server and access {{baseEndpoint}}/swagger-ui.html   

 5. Configuring Swagger : To configure we use instance or bean of Docket. (refer com.poc.springdatajpa.config.SwaggerConfiguration)
 
 6. Swagger annotaion
 - @ApiOperation( 
 value ="<string>" ,
 notes ="<string>"
 ) - it is used above controller mapped action method to give som info about api
 
 - @ApiParam(
 value = "<string>",
 required = true
 ) - used with @PathVariable
 
 - @ApiModel - used at the top of dto class
 - @ModelProperty - used with member variable of dto
 
 7 . Problem with swagger - the more info we want to convey the more aanotation we need to use .
 Spring REST DOCS overcomes this limitation 