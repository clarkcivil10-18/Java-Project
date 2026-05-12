/**
 * Write a description of class Multiplayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Multiplayer extends Game
{
    // instance variables - replace the example below with your own
    private int maxPlayers;

    /**
     * Constructor for objects of class Multiplayer
     */
    public Multiplayer(String title, Genre genre, AgeRating ageRating,
                       Platform platform, int minPlayers, int maxPlayers)
    {
        // initialise instance variables
        super(title, genre, ageRating, platform);
        this.maxPlayers = maxPlayers;
    }
    public void MultiplayerInfo()
    {
        System.out.println("Max Players: " + maxPlayers);
    }
    
}
