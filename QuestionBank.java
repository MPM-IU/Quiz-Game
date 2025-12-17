package quizGame;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Project: Quiz Game
 * Author: Andrew Busz
 * Date: 12/4/2025
 * Description: Stores and manages a collection of Question objects
 *              used by the quiz game.
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


    // Returns the entire list of questions
    public ArrayList<Question> getQuestions() {
        return questions;
    }


    // Replaces the entire list of questions with a new one
    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }


    // Randomly shuffles the order of questions
    public void shuffle() {
        Collections.shuffle(questions);
    }
}
