package soapApiResquest;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;

import static io.restassured.RestAssured.baseURI;;

public class SoapXMLRequest {

	@Test

	public void validateSoapXML() {

		// locate the saved wsdl xml file
		File file = new File(".\\SoapRequest\\Add.xml");

		// Call saved wsdl xml from file object
		FileInputStream fileInputStream = new FileInputStream(file),

		// add a request variable
		String requestBody = IOUtils.toString(fileInputStream, "UTF-8");

		baseURI = "http://dneonline.com";
		given().contentType("text/xml").accept(ContentType.XML).

				body(Body);
	}
}
