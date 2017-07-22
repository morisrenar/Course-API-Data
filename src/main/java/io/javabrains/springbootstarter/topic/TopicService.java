package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/21/17.
 */
@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Core Java", "Core java Description"),
			new Topic("Java Script", "Java Script", "Java Script Description")
	));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		for(Topic tp: topics) {
			if(tp.getId().equals(id) == true) {
				return tp;
			}
		}
		return null;
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		for(int index=0; index<topics.size(); index++) {
			Topic tp = topics.get(index);
			if(tp.getId().equals(id)) {
				topics.set(index, topic);
				return;
			}
		}
	}
	
	public void deleteTopic(String id) {
		for(int index=0; index<topics.size(); index++) {
			Topic tp = topics.get(index);
			if (tp.getId().equals(id)) {
				topics.remove(index);
				return;
			}
		}
	}
}
