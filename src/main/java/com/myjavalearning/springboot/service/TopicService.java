package com.myjavalearning.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myjavalearning.springboot.domain.Topic;
import com.myjavalearning.springboot.repository.TopicRepository;

@Service
public class TopicService{
	
	@Autowired
	TopicRepository topicRepository;
	
/*	List<Topic> topicList= new ArrayList<Topic>( Arrays.asList(new Topic(1,"java","java traininig"),
			new Topic(2,"react","react training"),
			new Topic(3,"Node.js","Node.JS training")));*/
	
	public List<Topic> getAllTopics(){
//		return topicList;
		return (List<Topic>) topicRepository.findAll();
	}
	
	public Topic getTopicById(Integer id) {
		
		return topicRepository.findOne(id);
		
	}

	public void addTopic(Topic topic) {
//		topicList.add(topic);
		// TODO Auto-generated method stub
		topicRepository.save(topic);
		
	}

	public void updateTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicRepository.save(topic);
		
	}

/*	public void updateTopic(Integer id, Topic topic) {
		// TODO Auto-generated method stub
		for (int i = 0; i < topicList.size(); i++) {
			Topic t = topicList.get(i);
			if(t.getId().equals(id)) {
				topicList.set(i, topic);
				return;
			}
		return;
		}*/
	}
