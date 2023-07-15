package com.skypro.cw2;

import com.skypro.cw2.model.Question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestingDataStorage {
    public static final Question QUESTION1_JAVA = new Question("Тестовый JavaВопрос1", "тестовый JavaОтвет1");
    public static final Question QUESTION2_JAVA = new Question("Тестовый JavaВопрос2", "тестовый JavaОтвет2");
    public static final Question QUESTION3_JAVA = new Question("Тестовый JavaВопрос3", "тестовый JavaОтвет3");
    public static final Question QUESTION4_JAVA = new Question("Тестовый JavaВопрос4", "тестовый JavaОтвет4");
    public static final Question QUESTION5_JAVA = new Question("Тестовый JavaВопрос5", "тестовый JavaОтвет5");

    public static final Question QUESTION1_MATH = new Question("Тестовый JavaВопрос1", "тестовый JavaОтвет1");
    public static final Question QUESTION2_MATH = new Question("Тестовый JavaВопрос2", "тестовый JavaОтвет2");
    public static final Question QUESTION3_MATH = new Question("Тестовый JavaВопрос3", "тестовый JavaОтвет3");
    public static final Question QUESTION4_MATH = new Question("Тестовый JavaВопрос4", "тестовый JavaОтвет4");
    public static final Question QUESTION5_MATH = new Question("Тестовый JavaВопрос5", "тестовый JavaОтвет5");

    public static Set<Question> EMPTY_SET = new HashSet<>();

    public static final Set<Question> FULL_JAVA_SET = new HashSet<>(Set.of(
            QUESTION1_JAVA,
            QUESTION2_JAVA,
            QUESTION3_JAVA,
            QUESTION4_JAVA,
            QUESTION5_JAVA
    ));

    public static final Set<Question> FULL_MATH_SET = new HashSet<>(Set.of(
            QUESTION1_MATH,
            QUESTION2_MATH,
            QUESTION3_MATH,
            QUESTION4_MATH,
            QUESTION5_MATH
    ));

    public static final Set<Question> FULL_TOTAL_SET = new HashSet<>(Set.of(
            QUESTION1_JAVA,
            QUESTION2_JAVA,
            QUESTION3_JAVA,
            QUESTION4_JAVA,
            QUESTION5_JAVA,
            QUESTION1_MATH,
            QUESTION2_MATH,
            QUESTION3_MATH,
            QUESTION4_MATH,
            QUESTION5_MATH
    ));

    public static final List<Question> FULL_TOTAL_LIST = new ArrayList<>(FULL_TOTAL_SET);
}
