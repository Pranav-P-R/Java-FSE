import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class AAAPatternTest {

    private int number;

    @Before
    public void setUp() {
        number = 10;
        System.out.println("Setup completed.");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown completed.");
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = number;
        int b = 5;

        // Act
        int result = a + b;

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testMultiplication() {

        // Arrange
        int a = number;
        int b = 2;

        // Act
        int result = a * b;

        // Assert
        assertEquals(20, result);
    }
}