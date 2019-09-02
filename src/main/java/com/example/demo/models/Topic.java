package com.example.demo.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class Topic {

	@Getter @Setter
	private String id, name, description;
	
}
