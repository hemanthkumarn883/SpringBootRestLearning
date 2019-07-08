package com.myjavalearning.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myjavalearning.springboot.domain.TopicES;
import com.myjavalearning.springboot.service.TopicESService;

@RestController
public class TopicESController {


	
	@Autowired
	TopicESService topicESService;
	
	@RequestMapping("/topicsES")
	public Iterable<TopicES> GetAllTopics() {
		return topicESService.getAllTopics();
	}
	
	@RequestMapping("/topicsES/{Id}")
	public TopicES getTopicById(@PathVariable String Id) {
		return topicESService.getTopicById(Id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topicsES")
	public void addTopic(@RequestBody TopicES topicES) {
		System.out.println(" es topic ====  "+topicES.toString());
		topicESService.addTopic(topicES);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topicsES/{id}")
	public void updateTopic(@RequestBody TopicES topicES) {
		System.out.println(" current topic to update "+topicES);
		topicESService.updateTopic(topicES);
		
	}


}
