package com.skypro.cw2.service;

import com.skypro.cw2.model.Question;

import java.util.Collection;

public interface QuestionService {

     Question add(String question, String answer);

     Question remove(Question question);

     Collection<Question> getAll();

     Question getRandomQuestion();

}
