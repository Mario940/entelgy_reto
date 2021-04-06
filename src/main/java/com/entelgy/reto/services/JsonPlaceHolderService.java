package com.entelgy.reto.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class JsonPlaceHolderService {
	
	private RestTemplate restTemplate = new RestTemplate();
	
	public ArrayList<Object> getJsonData(){
		String url = "https://jsonplaceholder.typicode.com/comments";
		@SuppressWarnings("unchecked")
		ArrayList<Object> jsonList = restTemplate.getForObject(url, ArrayList.class );
		return jsonList;
	}
	
	public Map<String, ArrayList<Object>> restructure(){
		Map<String,  ArrayList<Object>> map = new HashMap<String,  ArrayList<Object>>();
		map.put("data", getJsonData());
		return map;
	}

}
