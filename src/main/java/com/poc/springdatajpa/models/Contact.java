package com.poc.springdatajpa.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Model class for contact")
public class Contact {
	@ApiModelProperty(value = "id of contact")
	private String id;
	@ApiModelProperty(value = "name of contact")
	private String name ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
