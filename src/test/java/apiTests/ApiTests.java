package apiTests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("API")
public class ApiTests {


    @Test
    public void apitest1() {
        System.out.println("Api Test");
    }

//    @Test
//    public void apitest2() {
//        open("https://duckduckgo.com");
//        $(By.name("q")).val("qq").pressEnter();
//
//    }
}
