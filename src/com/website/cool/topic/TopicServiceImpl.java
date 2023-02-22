package com.website.cool.topic;

import org.springframework.beans.factory.annotation.Autowired;

public class TopicServiceImpl implements TopicService {

	@Autowired
	private TopicDAO topicDAO;
}
