package com.example.demo.Exception;


public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException(String exception){
        super(exception);
    }
}
