package com.skypro.cw2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NotEnoughQuestions extends RuntimeException{
    public NotEnoughQuestions() {
    }

    public NotEnoughQuestions(String message) {
        super(message);
    }

    public NotEnoughQuestions(String message, Throwable cause) {
        super(message, cause);
    }
}
