package com.stepsbysteps.service;

import com.stepsbysteps.data.Quiz;
import com.stepsbysteps.data.jpa.QuizPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizPersistence quizPersistence;

    public List<Quiz> getAllQuizzes() {
        return quizPersistence.findAll();
    }

    public List<Quiz> getAllUserQuizzes(String userID) {
        return quizPersistence.findAllByUserID(userID);
    }

    public Quiz getQuiz(Long id) {
        return quizPersistence.findById(id).orElse(null);
    }

    public Quiz save(Quiz quiz) {
        quiz.setTimestamp(System.currentTimeMillis());
        return quizPersistence.save(quiz);
    }

    public void deleteQuizEntry(Long id) {
        quizPersistence.deleteById(id);
    }
}
