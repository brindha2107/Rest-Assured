package StepDefinitions;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.apache.tools.ant.taskdefs.Get;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
@Test
public class ForeignSteps2 {
	public static void main(String args[]) {
	Response response = 
			given().log().all()
			.header("Content-Type", "application/json")
			.when().get("https://reqres.in/api/users?page=2")
			.then().log().all().statusCode(200).extract().response();
	         //Assert.assertEquals(200,response.getStatusCode());
	         //System.out.println("Status code is ");
			}
}
	


