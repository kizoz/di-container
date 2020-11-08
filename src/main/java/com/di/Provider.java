package com.di;

public interface Provider<T> {

    T getInstance() throws Exception;
}
