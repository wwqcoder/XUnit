package junit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Date 2020/8/4
 * @Autor weiqi.wang
 **/
public class TestUnit5 {

    @Test
    @DisplayName("junit 5 第一个用例")
    void demo(){
        assertEquals(1,2);
        System.out.println("这是我的第一个unit5demo");
    }
    @Test
    @DisplayName("junit 5 第一个失败，第二个仍然执行")
    void demo01(){
       assertAll("demo assertions",
               () -> assertEquals(1,2),
                () -> assertEquals(1,1),
                () -> assertEquals(1,3)
       );
    }

    @TestFactory
    List<String> dynamicTestsWithInvalidReturnType() {
        return Arrays.asList("Hello");
    }

    @TestFactory
    Collection<DynamicTest> dynamicTestsFromCollection() {
        return Arrays.asList(
                dynamicTest("1st dynamic test", () -> assertTrue(true)),
                dynamicTest("2nd dynamic test", () -> assertEquals(4, 4)),
                dynamicTest("2nd dynamic test", () -> assertEquals(4, 4)),
                dynamicTest("2nd dynamic test", () -> assertEquals(4, 4)),
                dynamicTest("2nd dynamic test", () -> assertEquals(4, 4)),
                dynamicTest("2nd dynamic test", () -> assertEquals(4, 4)),
                dynamicTest("2nd dynamic test", () -> assertEquals(4, 4)),
                dynamicTest("2nd dynamic test", () -> assertEquals(4, 4)),
                dynamicTest("2nd dynamic test", () -> assertEquals(4, 4))
        );
    }

    @TestFactory
    Iterable<DynamicTest> dynamicTestsFromIterable() {
        return Arrays.asList(
                dynamicTest("3rd dynamic test", () -> assertTrue(true)),
                dynamicTest("4th dynamic test", () -> assertEquals(4, 4))
        );
    }
}
