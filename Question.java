package quizGame;

/*
 * Project: Quiz Game
 * Author: Andrew Busz
 * Date: 12/4/2025
 * Description: This class represents a single quiz question,
 *             storing the question text, answer options, and
 *             the index of the correct answer.
*/

public class Question {

    // The text of the question
    private String prompt;

    // The possible answer choices
    private String[] options;

    // The index of the correct answer in the options array
    private int correctIndex;

    // Constructor: Creates a question with text, options, and the correct index
    public Question(String prompt, String[] options, int correctIndex) {
        this.prompt = prompt;
        this.options = options;
        this.correctIndex = correctIndex;
    }

    // Constructor: Creates an empty question placeholder
    public Question() {
        this.prompt = "";
        this.options = new String[0];
        this.correctIndex = -1;
    }

    // Returns the question text
    public String getPrompt() {
        return prompt;
    }

    // Sets the question text
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    // Returns the array of answer choices
    public String[] getOptions() {
        return options;
    }

    // Sets the answer choices
    public void setOptions(String[] options) {
        this.options = options;
    }

    // Returns the index of the correct answer
    public int getCorrectIndex() {
        return correctIndex;
    }

    // Sets the index of the correct answer
    public void setCorrectIndex(int correctIndex) {
        this.correctIndex = correctIndex;
    }
}