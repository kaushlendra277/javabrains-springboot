package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.models.Topic;
import com.example.demo.services.TopicService;

@Component
@ResponseBody
@RequestMapping("topics")
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@GetMapping("all")
	public List<Topic> getAll(){
		return topicService.getAll();
	}
	
	@GetMapping("{id}")
	public Topic getTopic(@PathVariable(required = true) String id) {
		return topicService.geTopic(id);
	}
	
	@PostMapping
	public void add(@RequestBody Topic topic) {
		topicService.add(topic);
	}
	
	@PutMapping("{id}")
	public Topic update(@PathVariable String id , @RequestBody Topic topic) {
		return topicService.update(id, topic);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		topicService.delete(id);
	}

}
