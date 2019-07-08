package com.myjavalearning.springboot.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.myjavalearning.springboot.domain.TopicES;

public interface TopicESRepository extends ElasticsearchRepository<TopicES, String>{

	TopicES findByEmail(String id);

}
