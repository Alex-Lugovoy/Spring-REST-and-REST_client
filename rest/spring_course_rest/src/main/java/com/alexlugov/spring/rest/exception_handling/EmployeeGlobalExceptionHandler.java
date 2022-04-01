package com.alexlugov.spring.rest.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> hundlerException(NoSuchEmployeeException exception){
        EmployeeIncorrectData tmp = new EmployeeIncorrectData();

        tmp.setInfo(exception.getMessage());
        return new ResponseEntity<>(tmp, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> hundlerException(Exception exception){
        EmployeeIncorrectData tmp = new EmployeeIncorrectData();

        tmp.setInfo(exception.getMessage());
        return new ResponseEntity<>(tmp, HttpStatus.BAD_REQUEST);
    }
}
