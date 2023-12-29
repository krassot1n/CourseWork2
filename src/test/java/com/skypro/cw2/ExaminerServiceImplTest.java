package com.skypro.cw2;

import com.skypro.cw2.model.Question;
import com.skypro.cw2.service.ExaminerServiceImpl;
import com.skypro.cw2.service.JavaQuestionService;
import com.skypro.cw2.service.MathQuestionService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {
    @Mock
    private JavaQuestionService javaQuestionService;
    @Mock
    private MathQuestionService mathQuestionService;
    @InjectMocks
    private ExaminerServiceImpl examinerServiceImpl;

    private final Set<Question> questionSet1 = new HashSet<>();
    private final Set<Question> questionSet2 = new HashSet<>();
    private final Question question11 = new Question("Q11", "A11");
    private final Question question12 = new Question("Q12", "A12");
    private final Question question13 = new Question("Q13", "A13");

    private final Question question21 = new Question("Q21", "A21");
    private final Question question22 = new Question("Q22", "A22");
    private final Question question23 = new Question("Q23", "A23");


    @Test
    public void getQuestionPositiveTest() {
        questionSet1.add(question11);
        questionSet1.add(question12);
        questionSet1.add(question13);

        questionSet2.add(question21);
        questionSet2.add(question22);
        questionSet2.add(question23);
        Mockito.when(javaQuestionService.getRandomQuestion())
                .thenReturn(question11)
                .thenReturn(question12)
                .thenReturn(question13);
        Mockito.when(mathQuestionService.getRandomQuestion())
                .thenReturn(question21)
                .thenReturn(question22)
                .thenReturn(question23);


        int requestedQuestionsCount = 2;

        assertEquals(requestedQuestionsCount, examinerServiceImpl.getQuestions(requestedQuestionsCount).size());


    }
}
