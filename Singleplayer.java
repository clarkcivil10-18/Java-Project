 
/**
 * Write a description of class Singleplayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Singleplayer extends Game
{
    // instance variables - replace the example below with your own
    private boolean storymode;
    private String difficulty;    

    /**
     * Constructor for objects of class Singleplayer
     */
    public Singleplayer(String title, Genre genre, AgeRating ageRating,
                       Platform platform, int minPlayers, int maxPlayers, 
                       boolean storymode, String difficulty)
    {
        // initialise instance variables
        super(title, genre, ageRating, platform);
        this.storymode = storymode;
        this.difficulty = difficulty;
    }
     public void checkStoryMode()
    {
        if (storymode)
        {
            System.out.println(getTitle() + " has a story mode.");
        }
        else
        {
            System.out.println(getTitle() + " does NOT have a story mode.");
        }
    }

    // Method to show difficulty
    public void showDifficulty()
    {
        System.out.println("Difficulty Level: " + difficulty);
    }
    
    
    
}