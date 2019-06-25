package com.myjavalearning.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.myjavalearning.springboot.domain.Topic;

@Service
public class TopicService {
	
	List<Topic> topicList= new ArrayList<Topic>( Arrays.asList(new Topic(1,"java","java traininig"),
			new Topic(2,"react","react training"),
			new Topic(3,"Node.js","Node.JS training")));
	
	public List<Topic> getAllTopics(){
		return topicList;
	}
	
	public Topic getTopicById(Integer id) {
		
				
		try {
			return topicList.stream().filter(obj -> obj.getId().equals(id)).findFirst().get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}

	public void addTopic(Topic topic) {
		topicList.add(topic);
		// TODO Auto-generated method stub
		
	}

	public void updateTopic(Integer id, Topic topic) {
		// TODO Auto-generated method stub
		for (int i = 0; i < topicList.size(); i++) {
			Topic t = topicList.get(i);
			if(t.getId().equals(id)) {
				topicList.set(i, topic);
				return;
			}
		}
	}
}
