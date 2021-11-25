package com.cleo.designPatterns.behaviourDesignPattern;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I quack");
    }
}
