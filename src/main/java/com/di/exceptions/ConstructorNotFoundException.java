package com.di.exceptions;

public class ConstructorNotFoundException extends Exception {

    @Override
    public String toString() {
        return "There are no required constructors";
    }
}
