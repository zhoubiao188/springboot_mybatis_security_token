package com.example.auth.demo.exception;

import com.example.auth.demo.domain.ResultJson;
import lombok.Getter;


@Getter
public class CustomException extends RuntimeException{
    private ResultJson resultJson;

    public CustomException(ResultJson resultJson) {
        this.resultJson = resultJson;
    }
}
