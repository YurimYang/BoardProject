package com.example.board_project.global.exception;

import lombok.Getter;

@Getter
public abstract class ApplicationException extends RuntimeException {

    private final ErrorCode errorCode;

    public ApplicationException(ErrorCode errorCode) {
        super(errorCode.getSimpleMessage());
        this.errorCode = errorCode;
    }
}