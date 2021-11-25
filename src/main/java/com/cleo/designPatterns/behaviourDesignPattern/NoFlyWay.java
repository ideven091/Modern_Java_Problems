package com.cleo.designPatterns.behaviourDesignPattern;

public class NoFlyWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
