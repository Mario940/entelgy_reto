package com.entelgy.reto.services;

import java.util.ArrayList;
import java.util.Map;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class JsonPlaceHolderServiceUnitTest {
	
	
	private JsonPlaceHolderService jsonPlaceHolderService = new JsonPlaceHolderService();
	
	
	@Test
	public void getJsonDataTest(){
		
		Assert.assertEquals(ArrayList.class, jsonPlaceHolderService.getJsonData().getClass());
	}
	
	@Test
	public void restructureTest() {
		Map<String,  ArrayList<Object>> mapTest = jsonPlaceHolderService.restructure();
		Assert.assertTrue(mapTest.containsKey("data"));
		Assert.assertEquals(ArrayList.class, mapTest.get("data").getClass());
	}
	

}
