package StepDefinitions;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
@Test
public class ForeignSteps1 {
	
	Response response;
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";
	}

	@When("posted with correct Information")
	public void posted_with_correct_information() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("When");
		response= RestAssured.put("/api/users");
		
		
	}
	

	@Then("validate positive response code received")
	public void validate_positive_response_code_received() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Then");
		System.out.println(response.getStatusLine());
		Assert.assertEquals(200,response.getStatusCode());
	}

}
