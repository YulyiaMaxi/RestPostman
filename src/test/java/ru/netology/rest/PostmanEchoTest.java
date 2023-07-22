package ru.netology.rest;
import org.junit.jupiter.api.Test;
import io.restassured.http.ContentType;
//import org.hamcrest.Matchers;


import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void shouldReturnSentData() {

        given()
                .baseUri("https://postman-echo.com")
                .body("Hi")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo ("Hi"));

    }
}
