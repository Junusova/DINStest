package tests

import baseMethods.gettingAllResourceGetMethod
import net.javacrumbs.jsonunit.JsonMatchers
import net.javacrumbs.jsonunit.core.util.ResourceUtils
import org.apache.http.HttpStatus
import org.junit.Assert
import org.junit.Test

class GettingAllResourcesTest {

    @Test
    fun test_01_GetAllResourcesShouldBeReturn200Ok() {

        val responseBody = gettingAllResourceGetMethod()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response()
                .asString()
        Assert.assertThat(
                responseBody,
                JsonMatchers.jsonEquals(ResourceUtils.resource("gettinngAllResourcesStatusCodeOkResponseBody.json"))
        )
    }
}