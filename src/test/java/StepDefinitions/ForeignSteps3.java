package StepDefinitions;

import static io.restassured.RestAssured.given;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
@Test
public class ForeignSteps3 {
	public static void main(String args[]) {
		Response response = 
				given().log().all()
				.header("Content-Type", "application/json")
				.when().get("https://reqres.in/api/users?page=2")
				.then().log().all().statusCode(200).extract().response();
		         Assert.assertEquals(200,response.getStatusCode());
		         System.out.println("Status code is "+response.getStatusCode());
				}
	}


