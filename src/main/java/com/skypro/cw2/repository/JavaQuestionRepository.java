package com.skypro.cw2.repository;

import com.skypro.cw2.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("javaRepository")
public class JavaQuestionRepository implements QuestionRepository {
    private final Set<Question> questions = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
        Question questionAdd = new Question(question, answer);
        questions.add(questionAdd);
        return questionAdd;
    }


    @Override
    public Question remove(Question question) {
        if (questions.remove(question)) {
            return question;
        }
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableSet(questions);
    }
}
