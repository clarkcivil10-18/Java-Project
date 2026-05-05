
/**
 * Write a description of class Singleplayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Singleplayer extends Game
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Singleplayer
     */
    public Singleplayer(String title, GENRE genre, AgeRating ageRating,
                       Platform platform, int minPlayers, int maxPlayers)
    {
        // initialise instance variables
        super(title, genre, ageRating, platform);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}