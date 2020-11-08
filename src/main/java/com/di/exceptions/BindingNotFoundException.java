package com.di.exceptions;

public class BindingNotFoundException extends Exception {

    @Override
    public String toString() {
        return "Binding for this class was not found in container";
    }
}
