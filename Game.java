
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // Coded by Nathan 
    private HashSet<Game> games;
    private String title;
    private GENRE genre;
    private AgeRating ageRating;
    private Platform platform;
    private float gameRating;
    private List<Float> ratings;
    /**
     * Constructor for objects of class Game
     */
    public Game(String title, GENRE genre, AgeRating ageRating, Platform platform)
    {
        // initialise instance variables
      this.title = title;
      this.genre = genre;
      this.ageRating = ageRating;
      this.platform = platform;
      this.ratings = new ArrayList<>();
      this.gameRating = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addRating(float rating)
    {
        // put your code here
        ratings.add(rating);
        float sum = 0;
        for (float r : ratings) sum += r;
        this.gameRating = sum / ratings.size();
    }
    
    public void printGameDetails(){
        System.out.println("Title   : " + title);
        System.out.println("Genre   : " + genre);
        System.out.println("Age Rating   : " + ageRating);
        System.out.println("Platform   : " + platform);
        System.out.println("Rating   : " + gameRating);
    }
    
    public String getTitle()            {return title;}
    public GENRE getGenre()             {return genre;}
    public AgeRating getAgeRating()     {return ageRating;}
    public Platform getPlatform()       {return platform;}
    public float getGameRating()        {return gameRating;}
    
    public void setTitle(String title)          { this.title = title; }
    public void setGenre(GENRE genre)           { this.genre = genre; }
    public void setAgeRating(AgeRating ar)      { this.ageRating = ar; }
    public void setPlatform(Platform platform)  { this.platform = platform; }
}