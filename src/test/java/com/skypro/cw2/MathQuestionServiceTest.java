package com.skypro.cw2;

import com.skypro.cw2.model.Question;
import com.skypro.cw2.repository.MathQuestionRepository;
import com.skypro.cw2.service.MathQuestionService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static com.skypro.cw2.TestingDataStorage.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class MathQuestionServiceTest {
    @Mock
    private MathQuestionRepository repository;
    @InjectMocks
    private MathQuestionService service;

    private final Question question = new Question("Вопрос", "Ответ");



    @Test
    public void addTests() {
        Mockito.when(service.add(question.getQuestion(),question.getAnswer())).thenReturn(question);
        Assertions.assertEquals(question, service.add("Вопрос","Ответ"));

        Mockito.when(service.add("Вопрос","Ответ")).thenReturn(question);
        Assertions.assertEquals(question, service.add(question.getQuestion(),question.getAnswer()));
    }
    @Test
    public void removeTests() {


        Mockito.when(service.remove(question)).thenReturn(question);
        Assertions.assertEquals(question, service.remove(question));

    }


    @Test
    public void getAllTests() {
        Set<Question> set = new HashSet<>();
        set.add(question);
        Mockito.when(repository.getAll()).thenReturn(set);
        Assertions.assertEquals(set, service.getAll());
    }

    @Test
    public void getRandomQuestionsTest() {


        Set<Question> set = new HashSet<>();
        set.add(question);
        Mockito.when(repository.getAll()).thenReturn(set);
        Assertions.assertEquals(question, service.getRandomQuestion());

    }
}
