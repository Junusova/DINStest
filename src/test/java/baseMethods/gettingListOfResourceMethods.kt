package baseMethods

import configurations.Instance.main_app_url
import io.restassured.RestAssured.given
import io.restassured.http.ContentType
import io.restassured.response.ValidatableResponse

fun gettingAllResourceGetMethod()
        : ValidatableResponse {

    return given()
                .contentType(ContentType.JSON).
           `when`()
                 .get("$main_app_url/posts").
            then()
}