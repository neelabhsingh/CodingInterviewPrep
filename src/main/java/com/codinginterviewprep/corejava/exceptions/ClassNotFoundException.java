package com.codinginterviewprep.corejava.exceptions;
class Student{

}
public class ClassNotFoundException {
    public static void main(String[] args) throws java.lang.ClassNotFoundException {
        Object o = Class.forName("Student").getNestHost();

    }
}
