package com.learn.javacore._22Generics;

public class GenericTest<T> {

    private  T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
