package com.lavant.parking_lot.advice;

import com.lavant.parking_lot.advice.dto.ErrorResponse;
import com.lavant.parking_lot.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Arrays;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponse> handleCustomException(CustomException ex) {
        ErrorResponse errorResponse = ErrorResponse.builder().
                message(ex.getMessage()).
                statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value()).
                stackTrace(Arrays.toString(ex.getStackTrace())).
                build();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
    }
}