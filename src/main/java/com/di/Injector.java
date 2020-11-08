package com.di;

import com.di.exceptions.BindingNotFoundException;
import com.di.exceptions.ConstructorNotFoundException;
import com.di.exceptions.TooManyConstructorsException;

public interface Injector {

    <T> Provider<T> getProvider(Class<T> type) throws Exception;

    <T> void bind(Class<T> intf, Class<? extends T> impl);

    <T> void bindSingleton(Class<T> intf, Class<? extends T> impl) throws Exception;
}
