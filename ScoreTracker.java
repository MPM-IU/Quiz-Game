/*
 * Project: Quiz Game
 * Class: ScoreTracker
 * Author: William Byers
 * Date: December 5, 2025
 * Description: Tracks the player's quiz score, questions answered, and correct answers.
 */

package quizGame;

public class ScoreTracker {

    // Attributes for total questions, correct answers, and score.
    private int totalQuestions;
    private int correctAnswers;
    private int score;

    // Creates a score tracker with all values set to zero.
    public ScoreTracker() {
        totalQuestions = 0;
        correctAnswers = 0;
        score = 0;
    }

    // Creates a score tracker with the given starting values.
    public ScoreTracker(int totalQuestions, int correctAnswers, int score) {
        this.totalQuestions = totalQuestions;
        this.correctAnswers = correctAnswers;
        this.score = score;
    }

    // Records a correct answer and updates totals and score.
    public void recordCorrectAnswer() {
        totalQuestions++;
        correctAnswers++;
        score++;
    }

    // Records an incorrect answer and updates the total questions.
    public void recordIncorrectAnswer() {
        totalQuestions++;
    }

    // Resets all tracking values back to zero.
    public void reset() {
        totalQuestions = 0;
        correctAnswers = 0;
        score = 0;
    }

    // Returns the total number of questions answered.
    public int getTotalQuestions() {
        return totalQuestions;
    }

    // Sets the total number of questions answered.
    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    // Returns the number of correct answers.
    public int getCorrectAnswers() {
        return correctAnswers;
    }

    // Sets the number of correct answers.
    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    // Returns the current score value.
    public int getScore() {
        return score;
    }

    // Sets the current score value.
    public void setScore(int score) {
        this.score = score;
    }

    // Returns accuracy as a percentage based on correct and total questions.
    public double getAccuracy() {
        if (totalQuestions == 0) {
            return 0.0;
        }
        return (double) correctAnswers / totalQuestions * 100.0;
    }
}
