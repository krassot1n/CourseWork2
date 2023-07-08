package com.skypro.cw2.service;

import com.skypro.cw2.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service("questionService")
public class JavaQuestionService implements QuestionService{
    private final Set<Question> questions = new HashSet<>();

    

    @Override
    public Question add(String question, String answer) {

        return null;
    }

    @Override
    public Question add(Question question) {

        return null;
    }

    @Override
    public Question remove(String question, String answer) {
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return null;
    }

    @Override
    public Question getRandomQuestion() {
        return null;
    }
}
