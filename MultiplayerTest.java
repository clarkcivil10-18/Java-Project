

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class MultiplayerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MultiplayerTest
{
    /**
     * Default constructor for test class MultiplayerTest
     */
    public MultiplayerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void TestMulti()
    {
        Multiplayer multipla1 = new Multiplayer("Call of Duty", Genre.SHOOTER, AgeRating.M, Platform.CONSOLE, 0, 12);
        multipla1.MultiplayerInfo();
        multipla1.printGameDetails();
        multipla1.addRating(8.5f);
    }
}
