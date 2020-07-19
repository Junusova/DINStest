package tests

import baseMethods.filteringByqueryParametersPostMethod
import org.apache.http.HttpStatus
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test

class FilteringByIdTest {

    @Test
    fun test_01_GetInfoByUserIdShouldBeReturn200Ok() {

        filteringByqueryParametersPostMethod(userId = 1)
                .statusCode(HttpStatus.SC_OK)
                .body("userId[0]", equalTo(1),
                "id[0]", equalTo(1),
                "title[0]", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"),
                        "body[0]", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"))
    }
}
