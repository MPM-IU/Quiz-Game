package quizGame;

/*
 * Project: Quiz Game
 * Author: Matthew McCreary
 * Date: 12/5/2025
 * Description: This class represents a single player in the quiz game,
 *              storing the player's name and current score.
 */

public class Player {

    // The name of the player
    private String name;

    // The player's current score in the quiz
    private int score;

    // Constructor: Creates a player with a given name and a starting score of 0
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    // Constructor: Creates a player with an empty name and score 0 (placeholder)
    public Player() {
        this.name = "";
        this.score = 0;
    }

    // Returns the player's name
    public String getName() {
        return name;
    }

    // Sets the player's name
    public void setName(String name) {
        this.name = name;
    }

    // Returns the player's current score
    public int getScore() {
        return score;
    }

    // Sets the player's current score
    public void setScore(int score) {
        this.score = score;
    }
}
