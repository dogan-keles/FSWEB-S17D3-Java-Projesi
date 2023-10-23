package com.workintech.zoo.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class ZooException extends RuntimeException{
    private HttpStatus status;

    public ZooException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
