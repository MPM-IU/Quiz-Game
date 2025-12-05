/**
 *Project: Quiz Game
 *@Author: Tyrone Chandler
 *Date: 12/05/2025
 *Description: Manages the overall quiz game and connects the player and questions.
 */


package quizgame;

public class QuizGame {

    private Player currentPlayer;
    private QuestionBank questionBank;
    private int currentQuestionIndex;

    // Constructor: creates a quiz game with a player and a question bank.
    public QuizGame(Player currentPlayer, QuestionBank questionBank) {
        this.currentPlayer = currentPlayer;
        this.questionBank = questionBank;
        this.currentQuestionIndex = 0;
    }

    // Constructor: creates a quiz game with no player and an empty question bank.
    public QuizGame() {
        this.currentPlayer = null;
        this.questionBank = new QuestionBank();
        this.currentQuestionIndex = 0;
    }

    // returns the current player 
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    // sets the current player 
    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    // returns the question bank
    public QuestionBank getQuestionBank() {
        return questionBank;
    }

    // sets the question bank 
    public void setQuestionBank(QuestionBank questionBank) {
        this.questionBank = questionBank;
    }

    // returns the index of the current question
    public int getCurrentQuestionIndex() {
        return currentQuestionIndex;
    }

    // sets the index of the current question
    public void setCurrentQuestionIndex(int currentQuestionIndex) {
        this.currentQuestionIndex = currentQuestionIndex;
    }

    // placeholder for starting the game 
    public void startGame() {
        //  Add code to start the quiz later.
        System.out.println("Starting the Quiz Game...");
    }

    //  placeholder for asking the next question in the quiz
    public void askNextQuestion() {
        //  Add code to show the next question later.
        System.out.println("Asking the next question...");
    }

    // placeholder for ending the game.
    public void endGame() {
        // Add code to show the final results later.
        System.out.println("Ending the quiz game...");
    }

    // entry point of the program used to test the QuizGame class.
    public static void main(String[] args) {
        Player player = new Player("Player 1");
        QuestionBank bank = new QuestionBank();
        QuizGame game = new QuizGame(player, bank);

        game.startGame();
    }
}
