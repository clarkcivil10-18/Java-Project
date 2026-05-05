import java.util.HashSet;

/**
 * Write a description of class GameLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameLibrary
{
    // instance variables - replace the example below with your own
    private HashSet<Game> games;
    private String name;

    /**
     * Constructor for objects of class GameLibrary
     */
    public GameLibrary(String name)
    {
        this.name = name;
        this.games = new HashSet<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void PrintDetails()
    {
        System.out.println(games);
    }
}
