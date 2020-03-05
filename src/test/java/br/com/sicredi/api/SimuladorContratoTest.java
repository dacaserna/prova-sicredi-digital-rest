package br.com.sicredi.api;

import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class SimuladorContratoTest extends BaseTest{

    @Test
    public void contratoTest() {
        when().
            get("/simulador").
        then().
            statusCode(200).
            body(matchesJsonSchema(new File("src\\test\\resources\\json_schemas\\simulador_v1_schema.json")));
    }

}