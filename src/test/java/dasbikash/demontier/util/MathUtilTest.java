package dasbikash.demontier.util;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MathUtilTest {
    private static int a;
    private static int b;

    @BeforeAll
    static void setUp(){
        a=4;
        b=6;
    }

    @Test
    @DisplayName("Successful Addition Test")
    void testSuccess(){
        Assertions.assertTrue(10==MathUtil.Add(a,b));
    }

    @Test
    void  testFailure(){
        Assertions.assertNotEquals(13,MathUtil.Add(a,b));
    }
}