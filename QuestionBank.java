package quizGame;

import java.util.ArrayList;

/*
 * Project: Quiz Game
 * Author: Andrew Busz
 * Date: 12/4/2025
 * Description: This class stores a collection of Question objects
 *             and provides access to them for the quiz game.
 */

public class QuestionBank {

    // A list storing all questions in the quiz
    private ArrayList<Question> questions;

    // Constructor: Creates an empty QuestionBank
    public QuestionBank() {
        questions = new ArrayList<Question>();
    }

    // Constructor: Creates a QuestionBank with an existing list of questions
    public QuestionBank(ArrayList<Question> questions) {
        this.questions = questions;
    }

    // Adds a Question object to the question bank
    public void addQuestion(Question q) {
        questions.add(q);
    }

    // Returns the Question object at the given index
    public Question getQuestion(int index) {
        return questions.get(index);
    }

    // Returns the total number of questions stored
    public int size() {
        return questions.size();
    }

    // Replaces the entire list of questions with a new one
    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    // Returns the entire list of questions
    public ArrayList<Question> getQuestions() {
        return questions;
    }

}
