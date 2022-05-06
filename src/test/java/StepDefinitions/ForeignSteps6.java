package StepDefinitions;

import static io.restassured.RestAssured.given;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
@Test
public class ForeignSteps6 {
	Response response;
	
	@Given("API for foreign exchange two")
	public void api_for_foreign_exchange_two() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RestAssured.baseURI="https://reqres.in";
	}

	@When("posted with future date information")
	public void posted_with_future_date_information() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		response= RestAssured.get("/api/2022-05-06");
	}

	@Then("validate positive response code received from futuredate")
	public void validate_positive_response_code_received_from_futuredate() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(response.getStatusLine());
		Assert.assertEquals(200,response.getStatusCode());
		String date = response.header("Date");
		 System.out.println("Date value: " + date);
		
		
	}
	public static void main(String args[]) {
		Response response = 
				given().log().all()
				.header("Content-Type", "application/json")
				.get("/api/2022-05-06")
				.then().log().all().statusCode(200).extract().response();
		         //Assert.assertEquals(400,response.getStatusCode());
		          //System.out.println("Status code is "+ response.getStatusCode());
				}

	}
	





