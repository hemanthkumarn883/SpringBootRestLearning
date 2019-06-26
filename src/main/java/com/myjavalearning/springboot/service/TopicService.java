package com.myjavalearning.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myjavalearning.springboot.Repository.TopicRepository;
import com.myjavalearning.springboot.domain.Topic;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepo;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<Topic>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopicById(Integer id) {

		return topicRepo.findOne(id);
	}

	public void addTopic(Topic topic) {

		topicRepo.save(topic);
	}

	public void updateTopic(Integer id, Topic topic) {

		topicRepo.save(topic);
	}

	public void deleteTopic(Integer id) {

		topicRepo.delete(id);
		;
	}
}
