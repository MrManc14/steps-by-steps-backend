package com.stepsbysteps.data.jpa;

import com.stepsbysteps.data.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizPersistence extends JpaRepository<Quiz, Long> {
    List<Quiz> findAllByUserID(String userID);
}