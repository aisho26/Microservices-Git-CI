package com.example.demo.Exception;
 
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
 
import java.util.HashMap;
import java.util.Map;
 
@ControllerAdvice
public class CustomeException {
 
    @org.springframework.web.bind.annotation.ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    Map<String,String> handleException(Exception e){
 
        Map<String,String> message = new HashMap<>();
        message.put(" error status","The information entered is invalid");
 
        return message;
    }
}