package quizGame;

import javax.swing.*;
import java.awt.*;

/*
 * Project: Quiz Game
 * Author: Andrew Busz
 * Date: 12/17/2025
 * Description: Swing GUI for the quiz game.
 */

public class QuizGUI extends JFrame {

    private QuizGame game;

    private JLabel titleLabel;
    private JLabel questionLabel;
    private JButton[] answerButtons;
    private JTextArea outputArea;

    public QuizGUI() {

        game = new QuizGame(new Player("Player 1"));

        initComponents();
        loadQuestion();
    }

    private void initComponents() {

        setTitle("Quiz Game");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        titleLabel = new JLabel("Select an answer for each question.", JLabel.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        questionLabel = new JLabel("", JLabel.CENTER);
        questionLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));

        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        answerButtons = new JButton[4];

        for (int i = 0; i < 4; i++) {
            final int index = i;
            answerButtons[i] = new JButton();
            answerButtons[i].addActionListener(e -> handleAnswer(index));
            buttonPanel.add(answerButtons[i]);
        }

        outputArea = new JTextArea(4, 30);
        outputArea.setEditable(false);
        outputArea.setEnabled(false);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(outputArea);

        JPanel bottomPanel = new JPanel(new BorderLayout(10, 10));
        bottomPanel.add(buttonPanel, BorderLayout.NORTH);
        bottomPanel.add(scrollPane, BorderLayout.CENTER);

        setLayout(new BorderLayout(10, 10));
        add(titleLabel, BorderLayout.NORTH);
        add(questionLabel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void loadQuestion() {

        Question q = game.getCurrentQuestion();

        if (q == null) {
            return;
        }

        questionLabel.setText(q.getPrompt());

        String[] options = q.getOptions();
        for (int i = 0; i < options.length; i++) {
            answerButtons[i].setText(options[i]);
            answerButtons[i].setEnabled(true);
        }

        outputArea.setText("");
    }

    private void handleAnswer(int selectedIndex) {

        Question q = game.getCurrentQuestion();

        if (q == null) {
            return;
        }

        if (q.isCorrect(selectedIndex)) {
            outputArea.setText("Correct!");
        } else {
            outputArea.setText("Incorrect.");
        }

        game.answerCurrentQuestion(selectedIndex);

        if (!game.isGameOver()) {
            loadQuestion();
        } else {
            ScoreTracker tracker = game.getScoreTracker();

            outputArea.setText(
                "Quiz Finished!\n" +
                "Score: " + tracker.getScore() + "\n" +
                "Correct Answers: " + tracker.getCorrectAnswers() + "\n" +
                "Accuracy: " + tracker.getAccuracy() + "%"
            );

            questionLabel.setText("Quiz Finished!");

            for (JButton b : answerButtons) {
                b.setEnabled(false);
            }
        }
    }

    public static void main(String[] args) {
        new QuizGUI();
    }
}
