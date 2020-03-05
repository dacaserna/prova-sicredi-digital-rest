package br.com.sicredi.api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

public class SimuladorGetTest extends BaseTest{

    @Test
    public void simuladorGetTest(){
        when().
            get("/simulador").
        then().
            statusCode(200).
            body("id", equalTo(1)).
            body("meses[0]", equalTo("112")).
            body("meses[1]", equalTo("124")).
            body("meses[2]", equalTo("136")).
            body("meses[3]", equalTo("148")).
            body("valor[0]", equalTo("2.802")).
            body("valor[1]", equalTo("3.174")).
            body("valor[2]", equalTo("3.564")).
            body("valor[3]", equalTo("3.971"));
    }

}
