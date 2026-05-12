/**
 * Write a description of class Local here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Local extends Multiplayer
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Local
     */
    public Local(String title, Genre genre, AgeRating ageRating,
                 Platform platform, int minPlayers, int maxPlayers) {
        super(title, genre, ageRating, platform, minPlayers, maxPlayers);
        
    }
    public void startLocalGame()
    {
        System.out.println(getTitle() + " local match started!");
    }
        
}