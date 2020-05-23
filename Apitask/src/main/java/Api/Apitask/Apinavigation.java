package Api.Apitask;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Apinavigation {
	//call api endpoint ,parsing json result ,check empty body element
	public void Apipage(){
		RestAssured.baseURI="https://cat-fact.herokuapp.com";
		
		RequestSpecification httprequest=RestAssured.given();
		
		Response response=httprequest.request(Method.GET, "/facts/random?animal_type=cat&amount=1");
		
		JsonPath jsonPathEvaluator = response.jsonPath();
		
		System.out.println(jsonPathEvaluator.get("text"));
		
		if(jsonPathEvaluator.get("text") != "" ){
			
				
			System.out.println("Text is not empty!!!!!");
			
		}else {
			
			System.out.println("Text is empty");

		}
		

		
		
		
//		String responsebody=response.getBody().asString();
//		System.out.println(responsebody);
//		
		
		
	
	}

}
