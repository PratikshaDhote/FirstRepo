package com.clc.maven.Mavenproject;

import org.json.JSONException;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Postrrestapi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String actorJson="id:"+"title"+"author";
		JSONObject object=new JSONObject();
		object.put("id", 11);
		object.put("title"," application");
		object.put("author", "pratiksha");
		//object.put("id", 11);
		System.out.println(object.toString());
		RestAssured.baseURI="http://localhost:3000/posts";
		
		RestAssured.given().contentType("application/JSON").body(object.toString()).when().post("").then().log();
		
	}

}
