package com.di.exceptions;

public class TooManyConstructorsException extends Exception {

    @Override
    public String toString() {
        return "There should be only one constructor with @Inject annotation";
    }
}
