import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {

    @Test
    public void test()
    {
        given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://gorest.co.in/public-api/users")
                .then()
                .statusCode(200);
    }
}
