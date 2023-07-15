package com.skypro.cw2.repository;

import com.skypro.cw2.model.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question add(String question, String answer);

    Question remove(Question question);

    Collection<Question> getAll();
}
