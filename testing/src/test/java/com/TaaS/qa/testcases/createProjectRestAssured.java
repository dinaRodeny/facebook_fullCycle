package com.TaaS.qa.testcases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class createProjectRestAssured 
{


	 @Test(priority=1)
	public void createProjectRestAssured()
	{ 
		String RequestBody = {\= "}; 
				int userid =
						given().
						header("Content-Type","application/json").
						header("authorization","").
						contentType(ContentType.JSON). //choose the request to be Json
						accept(ContentType.JSON). //choose the response to be Json
						body(RequestBody).
						when().
						post("/v2/job_templates/17/launch/").
						then().
						statusCode(201).log().all().
						extract().
						path("job");
				System.out.println(userid); }
}







