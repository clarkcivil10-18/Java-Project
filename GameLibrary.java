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
        for (Game game : games) {
        System.out.println("Title: " + game.getTitle() +
            ", Genre: " + game.getGenre() +
            ", Platform: " + game.getPlatform() +
            ", Age Rating: " + game.getAgeRating() +
            ", Rating: " + game.getGameRating()
        );
    }
    }
    public void addGame(Game game)
    {
        games.add(game);
    }
    public void listAllGames()
    {
        for(Game game: games){
            System.out.println(game.getTitle());
        } 
    }
    public void listByGenre(Genre genre)
    {
        for(Game game: games){
            if(game.getGenre() == genre) {
            System.out.println(game.getTitle());
        } 
    }
    }
    public void listByPlatform(Platform platform)
    {
        for(Game game: games){
            if(game.getPlatform() == platform) {
            System.out.println(game.getTitle());
        } 
    }
    }
    public void listByAgeRating(AgeRating ageRating)
    {
        for(Game game: games){
            if(game.getAgeRating() == ageRating) {
            System.out.println(game.getTitle());
        } 
    }
    }
    public void listByRating(float rating)
    {
        for(Game game: games){
            if(game.getGameRating() == rating) {
            System.out.println(game.getTitle() + " " + 
            game.getGameRating());
        } 
    }
    }
}
