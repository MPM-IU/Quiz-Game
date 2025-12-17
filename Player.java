package quizGame;

/*
 * Project: Quiz Game
 * Author: Matthew McCreary
 * Date: 12/17/2025
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

    // Constructor: Creates a player with an empty name and score 0
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

    // Sets the player's score (prevents negative values)
    public void setScore(int score) {
        if (score < 0) {
            this.score = 0;
        } else {
            this.score = score;
        }
    }

    // Increases the player's score by 1 (standard quiz behavior)
    public void incrementScore() {
        score++;
    }

    // Adds a specific number of points (flexible scoring)
    public void addPoints(int points) {
        if (points > 0) {
            score += points;
        }
    }

    // Resets the player's score to 0
    public void resetScore() {
        score = 0;
    }

    // Returns a readable string version of the player
    @Override
    public String toString() {
        return "Player{name='" + name + "', score=" + score + "}";
    }
}
