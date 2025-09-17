/**
 * This program shows the 3 types of comments in Java
 * using a simple "video game" example.
 */
public class Comments {
    public static void main(String[] args) {
        
        // This is a single-line comment
        // Imagine this prints the name of your favorite game
        System.out.println("Playing: Minecraft");
        
        /*
         * This is a multi-line comment.
         * Here we print the player's score and level.
         * In a real game, these values would change as you play.
         */
        System.out.println("Score: 1200");
        System.out.println("Level: 5");
        
        /**
         * This is a documentation comment.
         * It explains what the next line of code does:
         * It prints out a simple "Game Over" message.
         */
        System.out.println("Game Over! Thanks for playing.");
    }
}
