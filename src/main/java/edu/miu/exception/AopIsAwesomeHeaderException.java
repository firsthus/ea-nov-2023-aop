package edu.miu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AopIsAwesomeHeaderException extends RuntimeException {
    public AopIsAwesomeHeaderException() {
        super("AOP-IS-AWESOME header is missing");
    }
}

