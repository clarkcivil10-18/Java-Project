
import java.util.Scanner;
public class Main
{

    /**
     * Constructor for objects of class Main
     */
    public static void main(String[] arg)
    
    {
        Scanner scanner = new Scanner(System.in);
        GameLibrary library = new GameLibrary("My Library");
        Game game1 = new Game("Elden Ring", Genre.RPG,AgeRating.M,Platform.PC);
        Game game2 = new Game("Minecraft", Genre.ACTION,AgeRating.E10,Platform.CONSOLE);
        Game game3 = new Game("God Of War", Genre.ACTION,AgeRating.M,Platform.CONSOLE);
        Game game4 = new Game("Mario Kart", Genre.RACING,AgeRating.E,Platform.CONSOLE);
        Game game5 = new Game("Valorant", Genre.SHOOTER,AgeRating.T,Platform.PC);
        game1.addRating(9.5f);
        game2.addRating(10);
        game3.addRating(8);
        game4.addRating(6);
        game5.addRating(7.5f);
        
        library.addGame(game1);
        library.addGame(game2);
        library.addGame(game3);
        library.addGame(game4);
        library.addGame(game5);
        library.listAllGames();
        boolean running = true; 
        int choice = 0;
        while(running)
        {
            System.out.println("--- Library Menu ---");
            System.out.println("1. Add Game");
            System.out.println("2. List All Games");
            System.out.println("3. List By Genre");
            System.out.println("4. List By Age Rating");
            System.out.println("5. List By Platform");
            System.out.println("6. Print Details");
            System.out.println("7. Exit");
            System.out.println("-------------------------");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter game title:");
                    String title = scanner.nextLine();
                    
                    System.out.println("--- Choose Genre: ---");
                    System.out.println("1. ACTION");
                    System.out.println("2. STRATEGY");
                    System.out.println("3. PUZZLE");
                    System.out.println("4. RPG");
                    System.out.println("5. SPORTS");
                    System.out.println("6. SIMULATION");
                    System.out.println("7. RACING");
                    System.out.println("8. SHOOTER");
                    int genreChoice = scanner.nextInt();
                    scanner.nextLine();
                    
                Genre genre;
                switch (genreChoice)
                {
                        case 1: genre = Genre.ACTION; break;
                        case 2: genre = Genre.STRATEGY; break;
                        case 3: genre = Genre.PUZZLE; break;
                        case 4: genre = Genre.RPG; break;
                        case 5: genre = Genre.SPORTS; break;
                        case 6: genre = Genre.SIMULATION; break;
                        case 7: genre = Genre.RACING; break;
                        case 8: genre = Genre.SHOOTER; break;
                        default: genre = Genre.RPG;
                }
                    System.out.println("--- Choose Platform: ---");
                    System.out.println("1. PC");
                    System.out.println("2. Mobile");
                    System.out.println("3. Console");
                    int platformChoice = scanner.nextInt();
                    scanner.nextLine();

                Platform platform;
                switch (platformChoice)
                    {
                        case 1: platform = Platform.PC; break;
                        case 2: platform = Platform.MOBILE; break;
                        case 3: platform = Platform.CONSOLE; break;
                        default: platform = Platform.PC;
                    }
                 System.out.println("--- Choose Age Rating: ---");
                    System.out.println("1. C");
                    System.out.println("2. E");
                    System.out.println("3. E10");
                    System.out.println("4. T");
                    System.out.println("5. M");
                    System.out.println("6. A");
                    int ratingChoice = scanner.nextInt();
                    scanner.nextLine();

                    AgeRating ageRating;
                    switch (ratingChoice)
                    {
                        case 1: ageRating = AgeRating.C; break;
                        case 2: ageRating = AgeRating.E; break;
                        case 3: ageRating = AgeRating.E10; break;
                        case 4: ageRating = AgeRating.T; break;
                        case 5: ageRating = AgeRating.M; break;
                        case 6: ageRating = AgeRating.A; break;
                        default: ageRating = AgeRating.E;
                    }
                    System.out.println("--- Enter Game Rating: ---");
                    float gameRating = scanner.nextFloat();
                    scanner.nextLine();
                    if (gameRating > 10){
                        System.out.println("Error: Rating Too High!!!");
                    }else{
                    Game newGame = new Game(title, genre, ageRating, platform);
                    newGame.addRating(gameRating);
                    library.addGame(newGame);
                    System.out.println("Game added successfully!");
                }
                    break;
                case 2:library.listAllGames(); break;
                case 3:
                    System.out.println("--- Choose Genre: ---");
                    System.out.println("1. ACTION");
                    System.out.println("2. STRATEGY");
                    System.out.println("3. PUZZLE");
                    System.out.println("4. RPG");
                    System.out.println("5. SPORTS");
                    System.out.println("6. SIMULATION");
                    System.out.println("7. RACING");
                    System.out.println("8. SHOOTER");
                    genreChoice = scanner.nextInt();
                    scanner.nextLine();
                    
                Genre genre2;
                switch (genreChoice)
                {
                        case 1: genre = Genre.ACTION; break;
                        case 2: genre = Genre.STRATEGY; break;
                        case 3: genre = Genre.PUZZLE; break;
                        case 4: genre = Genre.RPG; break;
                        case 5: genre = Genre.SPORTS; break;
                        case 6: genre = Genre.SIMULATION; break;
                        case 7: genre = Genre.RACING; break;
                        case 8: genre = Genre.SHOOTER; break;
                        default: genre = Genre.RPG;
                }
                    library.listByGenre(genre); 
                    break;
                case 4:
                    System.out.println("--- Choose Age Rating: ---");
                    System.out.println("1. C");
                    System.out.println("2. E");
                    System.out.println("3. E10");
                    System.out.println("4. T");
                    System.out.println("5. M");
                    System.out.println("6. A");
                    ratingChoice = scanner.nextInt();
                    scanner.nextLine();

                    AgeRating ageRating2;
                    switch (ratingChoice)
                    {
                        case 1: ageRating = AgeRating.C; break;
                        case 2: ageRating = AgeRating.E; break;
                        case 3: ageRating = AgeRating.E10; break;
                        case 4: ageRating = AgeRating.T; break;
                        case 5: ageRating = AgeRating.M; break;
                        case 6: ageRating = AgeRating.A; break;
                        default: ageRating = AgeRating.E;
                    }
                    library.listByAgeRating(ageRating);
                    break;
                    case 5:
                        System.out.println("--- Choose Platform: ---");
                    System.out.println("1. PC");
                    System.out.println("2. Mobile");
                    System.out.println("3. Console");
                    platformChoice = scanner.nextInt();
                    scanner.nextLine();

                Platform platform2;
                switch (platformChoice)
                    {
                        case 1: platform = Platform.PC; break;
                        case 2: platform = Platform.MOBILE; break;
                        case 3: platform = Platform.CONSOLE; break;
                        default: platform = Platform.PC;
                    }
                        library.listByPlatform(platform);
                        break;
                    case 6:
                        library.PrintDetails();
                        break;
                    case 7:
                        running = false;
                        System.out.println("Leaving Program");
                        break;
                    default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    
    
}
