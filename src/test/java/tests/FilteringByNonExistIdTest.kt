package tests

import baseMethods.filteringByqueryParametersPostMethod
import org.apache.http.HttpStatus
import org.hamcrest.CoreMatchers.*
import org.junit.Test

class FilteringByNonExistIdTest {

    @Test
    fun test_01_GetInfoByNonExistUserIdShouldBeReturn200Ok() {

        filteringByqueryParametersPostMethod(userId = 999999)
                .statusCode(HttpStatus.SC_OK)
                .body("id", notNullValue())
    }
}