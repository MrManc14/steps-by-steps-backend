package com.stepsbysteps.rest.controller;

import com.stepsbysteps.data.Quiz;
import com.stepsbysteps.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="/quiz")
public class QuizController {

    @Autowired
    private QuizService service;

    @GetMapping(value="", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Quiz> getAllQuizzes() {
        return service.getAllQuizzes();
    }

    @GetMapping(path="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Quiz getQuizById(@RequestParam(name="id") Long id) {
        return service.getQuiz(id);
    }

    @PostMapping(path="", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void createQuizEntry(@RequestBody Quiz quiz) {
        service.save(quiz);
    }

    @DeleteMapping(path="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void deleteQuizEntry(@RequestParam(name = "id") Long id) {
        service.deleteQuizEntry(id);
    }

}