package com.skypro.cw2.controller;

import com.skypro.cw2.model.Question;
import com.skypro.cw2.service.ExaminerService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {
    private final ExaminerService service;

    public ExamController(ExaminerService service) {
        this.service = service;
    }

    @GetMapping("/get/{amount}")
    Collection<Question> getQuestion(@PathVariable("amount") int amount) {
        return service.getQuestions(amount);
    }
}
