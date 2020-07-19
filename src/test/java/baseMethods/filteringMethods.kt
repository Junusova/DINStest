package baseMethods

import configurations.Instance.main_app_url
import io.restassured.RestAssured.given
import io.restassured.http.ContentType
import io.restassured.response.ValidatableResponse

fun filteringByqueryParametersPostMethod(userId:Int)
        : ValidatableResponse {

    return given()
                  .contentType(ContentType.JSON).
            `when`()
                  .queryParam("userId", userId)
                  .get("$main_app_url/posts").
            then()
}