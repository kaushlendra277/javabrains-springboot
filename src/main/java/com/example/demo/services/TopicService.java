package com.example.demo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Topic;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			Topic.builder().description("Spring Frmework Description").id("Spring Framework").name("Spring Framework").build(),
			Topic.builder().description("Java Description").id("Java").name("Java").build()
			));
	
	public List<Topic> getAll() {
		return topics;
	}
	
	public Topic geTopic(String id) {
		return topics.stream().filter(e -> e.getId().equalsIgnoreCase(id)).findFirst().get();
	}

	public void add(Topic topic) {
		topics.add(topic);
		
	}

	public Topic update(String id, Topic topic) {
		for(int i = 0; i< topics.size(); i++) {
			if(topics.get(i).getId().equalsIgnoreCase(id)) {
				topics.set(i, topic);
				return topics.get(i);
			}
		}
		return null;
	}

	public void delete(String id) {
		topics.removeIf(e -> e.getId().equalsIgnoreCase(id));
	}


}
