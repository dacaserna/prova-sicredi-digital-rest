package br.com.sicredi.api;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.*;
import static io.restassured.RestAssured.*;

public class HealthCheckTest extends BaseTest {

    @Test
    public void healthCheckActuator(){
//        basePath = "/";
//        when().
//            get("actuator/health").
//        then().
//            statusCode(200).
//            body("status", equalTo("UP"));
        Assert.fail("Health check nao implementado!");

    }

}
