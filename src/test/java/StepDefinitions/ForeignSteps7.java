package StepDefinitions;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ForeignSteps7 {
@Test
public static void main(String args[]) {
	Response response = 
			given().log().all()
			.header("Content-Type", "application/json")
			.get("/api/2022-05-04")
			.then().log().all().statusCode(200).extract().response();
	         Assert.assertEquals(400,response.getStatusCode());
	          System.out.println("Status code is "+ response.getStatusCode());
			}

}
