package com.clc.maven.Mavenproject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Response response=RestAssured.get("http://localhost:3000/");
		System.out.println(response.asString());
		System.out.println(response.statusCode());
	}

}
