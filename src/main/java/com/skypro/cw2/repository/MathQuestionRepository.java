package com.skypro.cw2.repository;

import com.skypro.cw2.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("mathRepository")
public class MathQuestionRepository implements QuestionRepository {

    private final Set<Question> questions = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
        Question questionsAdd = new Question(question,answer);
        questions.add(questionsAdd);
        return questionsAdd;
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
