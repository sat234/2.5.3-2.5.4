// package Project_251_252;

// import java.util.Scanner;

// public class Player {
//     // Attributes
//     private String name;
//     private double points;

//     /**
//      * Constructs a new player and initializes their name.
//      */
//     public Player() {
//         initializeName();
//         points = 0.0;
//         System.out.println("Hello and welcome to our phrase guesser game, " + name);
//     }

//     /**
//      * Initialize the player's name by getting input from the user.
//      */
//     private void initializeName() {
//         System.out.println("Please enter your name: ");
//         Scanner scanner = new Scanner(System.in);
//         name = scanner.nextLine();
//     }

//     /**
//      * Get the player's name.
//      *
//      * @return The player's name.
//      */
//     public String getName() {
//         return name;
//     }

//     /**
//      * Get the player's current points.
//      *
//      * @return The player's points.
//      */
//     public double getPoints() {
//         return points;
//     }

//     /**
//      * Set the player's name to a new value.
//      *
//      * @param newName The new name for the player.
//      */
//     public void setName(String newName) {
//         name = newName;
//     }
// }

package Project_251_252;

import java.util.Scanner;

public class Player {
    // Attributes
    private String name;
    private double points;

    /**
     * Constructs a new player and initializes their name.
     */
    public Player() {
        initializeName();
        points = 0.0;
        System.out.println("Hello and welcome to our phrase gusser game, " + name);
    }

    /**
     * Initialize the player's name by getting input from the user.
     */
    private void initializeName() {
        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
    }

    /**
     * Get the player's name.
     *
     * @return The player's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the player's current points.
     *
     * @return The player's points.
     */
    public double getPoints() {
        return points;
    }

    /**
     * Set the player's name to a new value.
     *
     * @param newName The new name for the player.
     */
    public void setName(String newName) {
        name = newName;
    }

    public static void main(String[] args) {
        // Create a new player
        Player player = new Player();
        
        // Get the player's name
        String playerName = player.getName();
        System.out.println("The name of the person playing the game is: " + playerName);
        
        // Get the player's points
        double playerPoints = player.getPoints();
        System.out.println("The number of points the player has is: " + playerPoints);
    }
}
