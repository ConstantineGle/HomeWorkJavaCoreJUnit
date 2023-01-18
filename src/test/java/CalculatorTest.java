import org.junit.jupiter.api.*;

public class CalculatorTest {

    Calculator sut;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("@beforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        sut = new Calculator();
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("@afterAll");
    }

    @Test
    public void plus() {
        int a = 2, b = 3, expected = 5;
        int actual = sut.plus.apply(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divide() {
        int a = 8, b = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> sut.divide.apply(a, b));
    }

    @Test
    public void isPositive() {
        int a = 5;
        boolean actual = sut.isPositive.test(a);
        Assertions.assertTrue(actual);
    }

}
