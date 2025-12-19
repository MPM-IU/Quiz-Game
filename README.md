Quiz Game
C211 Group Project

Project Aim

The goal of this project is to create a simple Java-based quiz game that demonstrates object-oriented programming concepts, use of data structures, and basic graphical user interface design. The game presents users with multiple-choice math questions, allows them to select answers through a GUI, and provides immediate feedback along with a final score summary at the end of the quiz.

Project Description

This application is a quiz game focused on basic math problems. The user is presented with one question at a time through a graphical user interface and selects an answer using buttons. The program determines whether the selected answer is correct or incorrect, tracks the user’s progress and score, and displays final results including total score, number of correct answers, and accuracy once the quiz is complete.

Source Files and Their Purpose

Player.java
-Represents the player taking the quiz and stores basic player information such as name and score.
Question.java
-Represents a single quiz question, including the question text, multiple-choice answer options, and the index of the correct answer.
QuestionBank.java
-Stores and manages a collection of Question objects. It provides access to quiz questions and allows the game to retrieve them in order.
QuizGame.java
-Manages the overall quiz logic. This class controls the flow of the game, tracks the current question, processes user answers, and updates scoring through the ScoreTracker.
ScoreTracker.java
-Tracks the total number of questions answered, the number of correct answers, the score, and calculates the user’s accuracy.
QuizGUI.java
-Provides the graphical user interface for the quiz game using Java Swing. It displays questions and answer choices, captures user input, and shows feedback and final results.

Interface Functionality

The graphical user interface displays the quiz title and instructions, followed by the current question and four answer buttons. When a user selects an answer, the interface provides immediate feedback indicating whether the answer was correct or incorrect. After all questions have been answered, the GUI displays the final score, number of correct answers, and overall accuracy. The interface is intentionally minimal to focus on functionality and clarity.

How to Run the Application
-Ensure Java is installed on your system.
-Run the executable JAR file using the command:
        java -jar QuizGame.jar
-The quiz game window will open and allow the user to begin answering questions.

Contributors:

Matthew McCreary - Player class
Drew Busz - Question class, QuestionBank class, QuizGUI class
Tyrone Chandler - QuizGame class
William Byers - ScoreTracker class
