package tests

import baseMethods.filteringByqueryParametersPostMethod
import net.javacrumbs.jsonunit.JsonMatchers
import net.javacrumbs.jsonunit.core.util.ResourceUtils.resource
import org.apache.http.HttpStatus
import org.junit.Assert
import org.junit.Test

class FilteringByIdAssetWithJsonExampleTest {

    @Test
    fun test_01_GetInfoByUserIdShouldBeReturn200Ok() {

        val responseBody = filteringByqueryParametersPostMethod(userId = 1)
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response()
                .asString()
        Assert.assertThat(
                responseBody,
                JsonMatchers.jsonEquals(resource("filteringStatusCodeOkResponseBody.json"))
        )
    }
}