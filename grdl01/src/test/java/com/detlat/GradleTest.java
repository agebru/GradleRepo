package com.detlat;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class GradleTest {

	@SuppressWarnings("unchecked")
	@Test
	public void testGetPassangers() {
		
		// RestAssured.when().get("http://localhost:8080/grdl01/passangers/psgrs/").then().statusCode(200);	
		JsonPath response = RestAssured.when().get("http://localhost:8080/grdl01/passangers/psgrs/").thenReturn().getBody().jsonPath();
		System.out.println(response.prettyPrint());
		
		
	}
	
	
	@Test
	public void testFindPassanger() {
		RequestSpecification given = RestAssured.given();
		Response response=given.get("http://localhost:8080/grdl01/passangers/psgrs/14");
		JsonPath jsonPath=response.jsonPath();
		String passangerName=jsonPath.get("passangerName");
		
		System.out.println("Name received from Response ==>" + passangerName);		
		assertEquals(passangerName,"Merry");
	}
	
	/*@Test
	public void testDeletePassanger() {
		Response response=RestAssured.when().delete("http://localhost:8080/grdl01/passangers/psgrs/14");
		ResponseBody body=response.body();
		JsonPath jpath=body.jsonPath();
		assertEquals(jpath.get("passangerName"),"Merry");
		
	}*/

}
