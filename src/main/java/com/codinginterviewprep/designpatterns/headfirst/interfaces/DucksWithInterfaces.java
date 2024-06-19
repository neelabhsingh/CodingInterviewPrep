package com.codinginterviewprep.designpatterns.headfirst.interfaces;

import java.util.Arrays;
import java.util.List;

interface Flyable{
    public void fly();
}

interface Quackable{
    public void quack();
}
abstract class Duck{
    public void swim(){
        System.out.println("Swimming..");
    }

    public abstract void display();
}

class MallardDuck extends Duck implements Quackable, Flyable{

    @Override
    public void display() {
        System.out.println("I look like a Mallard Duck.");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck is Flying");
    }

    @Override
    public void quack() {
        System.out.println("Mallard Duck is quacking");
    }
}

class RedHeadDuck extends Duck implements Quackable, Flyable{

    @Override
    public void display() {
        System.out.println("I look like a Red Head Duck.");
    }

    @Override
    public void fly() {
        System.out.println("RedHeadDuck is Flying");
    }

    @Override
    public void quack() {
        System.out.println("RedHeadDuck is quacking");
    }
}

/*
 * Rubber Duck can not fly
 * */
class RubberDuck extends Duck implements Quackable{

    @Override
    public void display() {
        System.out.println("I look like a Rubber Duck.");
    }

    @Override
    public void quack() {
        System.out.println("Rubber Duck is Squeaking");
    }
}

//It does not quack or fly
class DecoyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I look like a Decoy Duck.");
    }
}
public class DucksWithInterfaces {
    public static void main(String[] args) {
        List<Duck> ducks = Arrays.asList(
                new MallardDuck(),
                new RedHeadDuck(),
                new RubberDuck(),
                new DecoyDuck());

        for(Duck duck: ducks){
            duck.display();
            duck.swim();
            if(duck instanceof Quackable){
                ((Quackable)duck).quack();
            }
            if(duck instanceof Flyable){
                ((Flyable)duck).fly();
            }
        }
    }
}
