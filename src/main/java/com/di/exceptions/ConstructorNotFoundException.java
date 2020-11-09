package com.di.exceptions;

public class ConstructorNotFoundException extends Exception {

    @Override
    public String getMessage() {
        return "There are no required constructors \n" + super.getMessage();
    }
}
