
import java.util.Scanner;
public class Main
{

    /**
     * Constructor for objects of class Main
     */
    public static void main(String[] arg)
    {
        GameLibrary library = new GameLibrary("My Library");
        Game game1 = new Game("Elden Ring", Genre.RPG,AgeRating.M,Platform.PC);
        Game game2 = new Game("Minecraft", Genre.ACTION,AgeRating.E10,Platform.CONSOLE);
        Game game3 = new Game("God Of War", Genre.ACTION,AgeRating.M,Platform.CONSOLE);
        Game game4 = new Game("Mario Kart", Genre.RACING,AgeRating.E,Platform.CONSOLE);
        Game game5 = new Game("Valorant", Genre.SHOOTER,AgeRating.T,Platform.PC);
        
        library.addGame(game1);
        library.addGame(game2);
        library.addGame(game3);
        library.addGame(game4);
        library.addGame(game5);
        library.listAllGames();
    }
    
    
}
