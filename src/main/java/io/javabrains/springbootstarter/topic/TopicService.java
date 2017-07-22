package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/21/17.
 */
@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Core Java", "Core java Description"),
			new Topic("Java Script", "Java Script", "Java Script Description")
	));
	
	public List<Topic> getAllTopics() {
		//return topics;
		List<Topic> topics = new ArrayList<>();
		for(Topic tp: topicRepository.findAll()) {
			topics.add(tp);
		}
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
}
