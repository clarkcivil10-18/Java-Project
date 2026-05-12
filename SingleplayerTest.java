

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SingleplayerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SingleplayerTest
{
    /**
     * Default constructor for test class SingleplayerTest
     */
    public SingleplayerTest()
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
    public void TEstSingle()
    {
        Singleplayer singlepl1 = new Singleplayer("Space Marines", Genre.ACTION, AgeRating.M, Platform.PC, 1, 3, true, "Hard");
        singlepl1.checkStoryMode();
        singlepl1.showDifficulty();
        singlepl1.addRating(9.5f);
        singlepl1.printGameDetails();
    }
}
