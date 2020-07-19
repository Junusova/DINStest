package tests

import baseMethods.gettingByIdGetMethod
import org.apache.http.HttpStatus
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test

class GettingPostByIdTest {

    @Test
    fun test_01_GetInfoByIdShouldBeReturn200Ok() {
        gettingByIdGetMethod()
                .statusCode(HttpStatus.SC_OK)
                .body("userId", equalTo(1),
                        "id", equalTo(1),
                        "title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"),
                        "body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"))
    }
    }
