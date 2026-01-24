package TestingRestAssured.TestingRestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReqResGet_W {
	public static void main(String args[]) throws InterruptedException{
		RestAssured.baseURI="https://reqres.in";
		String Endp="/api/users";
		String apiKey="reqres-free-v1";
		
		Response response=RestAssured.given().relaxedHTTPSValidation().auth().oauth2(apiKey)
				//.header("Authorization", " " + apiKey)  //sending 
				.when().get(Endp).then().extract().response();
		
		int scode=response.statusCode();
		System.out.println("The status code is : " + " " + scode);
		
		//response documentation methods
		//int statusCode=response.statusCode();
		String statusLine=response.statusLine();
		int statusCode1=response.getStatusCode();
		String statusLine1=response.statusLine();
		
		String bodyData=response.getBody().asPrettyString();
		System.out.println(bodyData);
				
	}

}
