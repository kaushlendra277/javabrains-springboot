package com.poc.springdatajpa.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	
	@Value("${swagger.app.title:Demo- Api docs}")
	private String apiTitle ;

	 /**
	   * Api.
	   *
	   * @return the docket
	   */
	  @Bean
	  public Docket api() {
	    return new Docket(DocumentationType.SWAGGER_2)
	    		.select() // builder design pattern
	    		 // this removes dto info from swagger doc 
	    		.apis(RequestHandlerSelectors.basePackage("com.poc.springdatajpa.controller"))
	    		// this removes mvc error mapping
	    		.paths(regex("/v1.*"))
	    		.build()
	    		 // cofiguring default meta data like title, licence etc
	    		.apiInfo(apiInfo());
	  }
	  
	  private ApiInfo apiInfo() {
		    return new ApiInfoBuilder()
		    		.title(apiTitle)
		    		.build();
		}
}
