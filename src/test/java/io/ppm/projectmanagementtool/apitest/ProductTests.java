package io.ppm.projectmanagementtool.apitest;


import io.restassured.builder.RequestSpecBuilder;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class ProductTests {


    @Test
    public void getCategories(){

        String endpoint = "";
        var  response = given().
                queryParam("id","60ad958dab58ac3a67874a8f")
                .when()
                .get(endpoint)
                .then();
        response.log().body();

    }
}
