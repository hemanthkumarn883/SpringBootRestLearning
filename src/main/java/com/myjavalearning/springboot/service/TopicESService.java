package com.myjavalearning.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myjavalearning.springboot.domain.TopicES;
import com.myjavalearning.springboot.repository.TopicESRepository;

@Service
public class TopicESService {


	
	@Autowired
	TopicESRepository topicESRepository;
	
	public Iterable<TopicES> getAllTopics(){
		return  topicESRepository.findAll();
	}
	
	public TopicES getTopicById(String id) {
		
		return topicESRepository.findOne(id);
		
	}

	public void addTopic(TopicES topicES) {
		System.out.println(" es add service  ====  "+topicES.toString());
		topicESRepository.save(topicES);
		
	}

	public void updateTopic(TopicES topicES) {
		topicESRepository.save(topicES);
		
	}
}
