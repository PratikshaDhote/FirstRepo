package com.clc.maven.Mavenproject;

import org.json.JSONObject;

import io.restassured.RestAssured;

public class Patch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String actorJson="author";
		JSONObject object=new JSONObject();
		//object.put("id", 11);
		//object.put("title"," application");
		object.put("author", "m");
		RestAssured.baseURI="https://localhost:3000";
		Posts post = new Posts();
	    post.setId ("3");
	    post.setTitle ("Hello Vietnam");
	    
	    given().body (post)
	    .when ()
	    .contentType (ContentType.JSON)
	    .patch ("/posts/3");
	
	}
}