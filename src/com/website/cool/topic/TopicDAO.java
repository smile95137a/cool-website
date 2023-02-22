package com.website.cool.topic;

import java.util.List;


public interface TopicDAO {
	
public void addCategory();
	
	public List<TopicVO> getAllTopic();
	
	public TopicVO getTopic(Integer id);
	
	public void updateTopic(TopicVO topicVO);
	
	public void deleteTopic(Integer id);
}
