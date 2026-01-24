package TestingRestAssured.TestingRestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test003 {
	public static void main(String args[]) throws InterruptedException{
		RestAssured.baseURI="https://api.github.com";

		String ep2="/users/bipashakamra07/repos";
		
		String res=RestAssured.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + token).get(ep2).statusLine();
		
		int res1= RestAssured.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + token).get(ep2).statusCode();
				
		String StatusBody1=RestAssured.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + token).get(ep2).asPrettyString();
				
		System.out.println(res);
		System.out.println(res1);
		System.out.println(StatusBody1);			
	}

}
