package com.skypro.cw2.exceptions;

public class EmptyQuestionService extends RuntimeException {
    public EmptyQuestionService() {
    }

    public EmptyQuestionService(String message) {
        super(message);
    }
}
