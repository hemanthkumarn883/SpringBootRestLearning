package com.myjavalearning.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myjavalearning.springboot.domain.Topic;
import com.myjavalearning.springboot.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> GetAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{Id}")
	public Topic getTopicById(@PathVariable Integer Id) {
		return topicService.getTopicById(Id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
//	public void updateTopic(@RequestBody Topic topic, @PathVariable Integer id) {
	public void updateTopic(@RequestBody Topic topic) {
		System.out.println(" current topic to update "+topic);
//		topicService.updateTopic(id,topic);
		topicService.updateTopic(topic);
		
	}

}
