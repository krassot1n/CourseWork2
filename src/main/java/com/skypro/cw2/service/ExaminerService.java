package com.skypro.cw2.service;

import com.skypro.cw2.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
