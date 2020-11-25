package nu.yonas.www;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TextProcessorTest {

    @BeforeAll
    public static void BeforeAll(){
        System.out.println("Initiating testing");
    }
    @BeforeEach
    void BeforeEach(){
        System.out.println("Testing");
    }
    @AfterEach
    void AfterEach(){
        System.out.println("Completed this test");
    }

    @Test
    void testLowerCase() {
        TextProcessor textProcessor = new TextProcessor();
        assertTrue(TextProcessor.lowerCase("Testing").equals("testing"));
        System.out.println("Assertion is true");
    }

    @Test
    void testUpperCase() {
        TextProcessor textProcessor = new TextProcessor();
        assertFalse(TextProcessor.upperCase("Testing").equals("testing"));
        System.out.println("Assertion is false");
    }

    @Test
    void testReverseText() {
        TextProcessor textProcessor = new TextProcessor();
        String testReverse = "Japan";
        assertNotNull(TextProcessor.reverseText(testReverse).equals("napaJ"));
        System.out.println("Value is null");
    }
}