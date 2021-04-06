package com.entelgy.reto.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.entelgy.reto.services.JsonPlaceHolderService;


@RestController
@RequestMapping("/comments")
public class JsonPlaceHolderController {
	
	@Autowired
	private JsonPlaceHolderService jsonPlaceHolderService;
	
	@PostMapping
	public ResponseEntity<Map<String, ArrayList<Object>>> getRestructuredData() {
		
		return ResponseEntity.ok(jsonPlaceHolderService.restructure()); 
	}

}
