
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Main
     */
    public static void main(String[] arg)
    {
        GameLibrary library = new GameLibrary("My Library");
        Game game1 = new Game("Elden Ring", Genre.RPG,AgeRating.M,Platform.PC);
        Game game2 = new Game("Minecraft", Genre.ACTION,AgeRating.E,Platform.CONSOLE);
        Game game3 = new Game("God Of War", Genre.ACTION,AgeRating.M,Platform.CONSOLE);
        library.addGame(game1);
        library.addGame(game2);
        library.addGame(game3);
        library.addGame(game4);
        library.addGame(game5);
        library.listAllGames();
    }
    
    
}
