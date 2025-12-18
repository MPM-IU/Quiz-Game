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

// Creates a quiz game with a player and automatically loads questions
	public QuizGame(Player player) {
		this.player = player;
		this.questionBank = new QuestionBank();
		this.scoreTracker = new ScoreTracker();
		this.currentQuestionIndex = 0;
		loadQuestions();
	}

// Default constructor
	public QuizGame() {
		this(new Player());
	}

// Loads quiz questions into the question bank
	private void loadQuestions() {

		questionBank.addQuestion(new Question("What is 2 + 2?", new String[] { "3", "4", "5", "6" }, 1));

		questionBank.addQuestion(new Question("What is 5 - 3?", new String[] { "1", "2", "3", "4" }, 1));

		questionBank.addQuestion(new Question("What is 4 × 3?", new String[] { "7", "10", "12", "14" }, 2));

		questionBank.addQuestion(new Question("What is 10 ÷ 2?", new String[] { "2", "4", "5", "6" }, 2));

		questionBank.addQuestion(new Question("What is 9 + 6?", new String[] { "12", "13", "14", "15" }, 3));
	}

	public Player getPlayer() {
		return player;
	}

	public Question getCurrentQuestion() {
		if (currentQuestionIndex < questionBank.size()) {
			return questionBank.getQuestion(currentQuestionIndex);
		}
		return null;
	}

	public void answerCurrentQuestion(int selectedIndex) {
		Question q = getCurrentQuestion();

		if (q == null) {
			return;
		}

		if (q.isCorrect(selectedIndex)) {
			scoreTracker.recordCorrectAnswer();
			player.incrementScore();
		} else {
			scoreTracker.recordIncorrectAnswer();
		}

		currentQuestionIndex++;
	}

	public boolean isGameOver() {
		return currentQuestionIndex >= questionBank.size();
	}

	public ScoreTracker getScoreTracker() {
		return scoreTracker;
	}

	public void resetGame() {
		currentQuestionIndex = 0;
		scoreTracker.reset();
		player.resetScore();
	}

// Optional console test
	public static void main(String[] args) {
		QuizGame game = new QuizGame(new Player("Test Player"));
		System.out.println("Loaded " + game.questionBank.size() + " questions.");
	}
}

