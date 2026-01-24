package TestingRestAssured.TestingRestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequest002{
	public static void main (String args[]) throws InterruptedException{
	RestAssured.baseURI="https://api.github.com";
		

	
	String body= "{\"name\":\"DemoBipasha12\",\"description\":\"Created using Github REST API\" ,\"private\":\"false\"}";
	
	Response response=RestAssured.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + token).when().header("Accept", "application/vnd.github+json").body(body).post("/user/repos");
		
	int statusCode = response.statusCode();
	System.out.println("Status Code: " + response.getStatusCode());
	}
}
