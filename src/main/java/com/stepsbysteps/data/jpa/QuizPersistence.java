package com.stepsbysteps.data.jpa;

import com.stepsbysteps.data.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizPersistence extends JpaRepository<Quiz, Long> {
}