package com.portfolio.song_repository.exceptions;

public class EmptyValueFieldException extends RuntimeException {
    public EmptyValueFieldException(String message) {
        super(message);
    }
}
