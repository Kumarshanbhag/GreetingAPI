package com.greeting.exception;

public class UserException extends RuntimeException {
    public String message;

    public UserException(String message) {
        this.message = message;
    }
}
