package com.skypro.cw2.service;


import com.skypro.cw2.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final List<QuestionService> questionServiceList;

    private final Random random = new Random(723);


    public ExaminerServiceImpl(JavaQuestionService javaQuestionService, MathQuestionService mathQuestionService) {
        this.questionServiceList = new ArrayList<>();
        questionServiceList.add(javaQuestionService);
        questionServiceList.add(mathQuestionService);


    }

    @Override
    public Set<Question> getQuestions(int amount) {
        HashSet<Question> randomQuestion = new HashSet<>();
        while (randomQuestion.size() < amount) {
            if (random.nextInt(0, 2) == 0) {
                randomQuestion.add(questionServiceList.get(0).getRandomQuestion());
            } else {
                randomQuestion.add(questionServiceList.get(1).getRandomQuestion());
            }
        }
        return randomQuestion;

    }
}
