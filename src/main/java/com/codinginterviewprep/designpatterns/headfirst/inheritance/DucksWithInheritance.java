package com.codinginterviewprep.designpatterns.headfirst.inheritance;

import java.util.Arrays;
import java.util.List;

abstract class Duck{
    public void quack(){
        System.out.println("Quack!");
    }
    public void swim(){
        System.out.println("Swimming..");
    }
    public void fly(){
        System.out.println("Flying...");
    }
    public abstract void display();
}

class MallardDuck extends Duck{

    @Override
    public void display() {
        System.out.println("I look like a Mallard Duck.");
    }
}

class RedHeadDuck extends Duck{

    @Override
    public void display() {
        System.out.println("I look like a Red Head Duck.");
    }
}

/*
* Rubber Duck can not fly
* */
class RubberDuck extends Duck{

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void display() {
        System.out.println("I look like a Rubber Duck.");
    }
}

//It does not quack or fly
class DecoyDuck extends Duck{

    @Override
    public void display() {
        System.out.println("I look like a Decoy Duck.");
    }
}
public class DucksWithInheritance {
    public static void main(String[] args) {
        List<Duck> list = Arrays.asList(new MallardDuck(),
                new RedHeadDuck(),
                new RubberDuck(), new DecoyDuck());


        list.forEach(duck -> {
            duck.quack();
            duck.swim();
            duck.display();
            duck.fly();
        });
    }
}
