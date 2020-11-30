package nu.yonas.www;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    public static void BeforeAll() {
        System.out.println("Running all tests");
    }
    @BeforeEach
    void BeforeEach(){
        System.out.println("Running a test");
    }

    @AfterEach
    void AfterEach(){
        System.out.println("Test finished");
    }

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        assertNotEquals(8,calculator.division(22,4));
        System.out.println("22 divided by 4 shouldn't be 8");
    }

    @RepeatedTest(2)
    void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(5,calculator.subtraction(10,5));
        System.out.println("10 subtracted by 5, should be 5");
    }
    @DisplayName("Multiplication")
    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(40, calculator.multiplication(4,10));
        System.out.println("4 times 10 should be be 40");
    }

    //@Disabled("This test will not be running")
    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(200,calculator.division(800,4));
        System.out.println("800 divided by four should be 200");
    }

    @AfterAll
    static void AfterAll(){
        System.out.println("All tests are finished");
    }
}