/**
 *Project: Quiz Game
 *@Author: Tyrone Chandler
 *Date: 12/17/2025
 *Description: Manages the overall quiz game and connects the player and questions.
 */



package quizGame;

public class QuizGame {

    // The player taking the quiz
    private Player player;

    // The bank that stores all quiz questions
    private QuestionBank questionBank;

    // Tracks the score for this quiz
    private ScoreTracker scoreTracker;

    // The index of the current question in the question bank
    private int currentQuestionIndex;


    // Creates a quiz game with player and question bank
    public QuizGame(Player player, QuestionBank questionBank) {
        this.player = player;
        this.questionBank = questionBank;
        this.scoreTracker = new ScoreTracker();
        this.currentQuestionIndex = 0;
    }


    // Creates a quiz game with a default player and an empty question bank
    public QuizGame() {
        this.player = new Player();
        this.questionBank = new QuestionBank();
        this.scoreTracker = new ScoreTracker();
        this.currentQuestionIndex = 0;
    }


    // Returns the current player in this quiz game
    public Player getPlayer() {
        return player;
    }


    // Sets the current player in this quiz game
    public void setPlayer(Player player) {
        this.player = player;
    }


    // Returns the question bank used by this quiz game
    public QuestionBank getQuestionBank() {
        return questionBank;
    }


    // Sets the question bank used by this quiz game
    public void setQuestionBank(QuestionBank questionBank) {
        this.questionBank = questionBank;
    }


    // Returns the score tracker for this quiz game
    public ScoreTracker getScoreTracker() {
        return scoreTracker;
    }


    // Sets the score tracker for this quiz game
    public void setScoreTracker(ScoreTracker scoreTracker) {
        this.scoreTracker = scoreTracker;
    }


    // Returns the index of the current question
    public int getCurrentQuestionIndex() {
        return currentQuestionIndex;
    }


    // Sets the index of the current question
    public void setCurrentQuestionIndex(int currentQuestionIndex) {
        this.currentQuestionIndex = currentQuestionIndex;
    }


    // Starts the quiz by resetting progress and scores
    public void startGame() {
        currentQuestionIndex = 0;

        if (scoreTracker != null) {
            scoreTracker.reset();
        }

        if (player != null) {
            player.resetScore();
        }
    }


    // Returns the current question, or null if there is none
    public Question getCurrentQuestion() {
        if (questionBank == null) {
            return null;
        }

        if (currentQuestionIndex < 0 || currentQuestionIndex >= questionBank.size()) {
            return null;
        }

        return questionBank.getQuestion(currentQuestionIndex);
    }


    // Records an answer for the current question and moves to the next one
    public void answerCurrentQuestion(int selectedIndex) {
        Question current = getCurrentQuestion();

        if (current == null) {
            return;
        }

        if (current.isCorrect(selectedIndex)) {
            if (scoreTracker != null) {
                scoreTracker.recordCorrectAnswer();
            }

            if (player != null) {
                player.incrementScore();
            }
        } else {
            if (scoreTracker != null) {
                scoreTracker.recordIncorrectAnswer();
            }
        }

        currentQuestionIndex++;
    }


    // Returns true if there are no more questions to answer
    public boolean isGameOver() {
        if (questionBank == null) {
            return true;
        }

        return currentQuestionIndex >= questionBank.size();
    }


    // Resets the game state so the quiz can be played again
    public void resetGame() {
        currentQuestionIndex = 0;

        if (scoreTracker != null) {
            scoreTracker.reset();
        }

        if (player != null) {
            player.resetScore();
        }
    }


    // Main method: creates a sample game and loads math questions into the question bank
    public static void main(String[] args) {

        QuestionBank bank = new QuestionBank();

        bank.addQuestion(new Question(
            "What is 2 + 2?",
            new String[] { "3", "4", "5", "6" },
            1
        ));

        bank.addQuestion(new Question(
            "What is 5 - 3?",
            new String[] { "1", "2", "3", "4" },
            1
        ));

        bank.addQuestion(new Question(
            "What is 4 \u00d7 3?",
            new String[] { "7", "10", "12", "14" },
            2
        ));

        bank.addQuestion(new Question(
            "What is 10 \u00f7 2?",
            new String[] { "2", "4", "5", "6" },
            2
        ));

        bank.addQuestion(new Question(
            "What is 9 + 6?",
            new String[] { "12", "13", "14", "15" },
            3
        ));

        Player player = new Player("Player 1");

        QuizGame game = new QuizGame(player, bank);

        System.out.println("Quiz game created for " + player.getName() +
                           " with " + bank.size() + " questions.");
    }
}


