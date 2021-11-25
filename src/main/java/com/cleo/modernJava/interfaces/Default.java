package com.cleo.modernJava.interfaces;

public interface Default {

    String name = "abcdef";
    int DEFAULT_VALUE=10000;

    String getName();

    default int defaultMethod(int value){
        return DEFAULT_VALUE + value;

    }

}
