package com.skypro.cw2.service;

import com.skypro.cw2.model.Question;
import com.skypro.cw2.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("mathQuestions")
public class MathQuestionService implements QuestionService {
    private final QuestionRepository repository;
    private final Random random = new Random();

    public MathQuestionService(@Qualifier("mathRepository") QuestionRepository repository) {
        this.repository = repository;
    }

    @Override
    public Question add(String question, String answer) {
        return repository.add(question, answer);
    }

    @Override
    public Question remove(Question question) {
        return repository.remove(question);
    }

    @Override
    public Collection<Question> getAll() {
        return repository.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        int allQuestions = repository.getAll().size();
        var index = random.nextInt(allQuestions);
        int i = 0;
        for (Question question : repository.getAll()) {
            if (index == i) {
                return question;
            }
            i++;
        }

        return null;
    }
}
