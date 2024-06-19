package com.codinginterviewprep.interviews.companies;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

class Student{
    public Student(int id, String name, String sction, int marks) {
        this.id = id;
        this.name = name;
        this.sction = sction;
        this.marks = marks;
    }

    int id;
    String name;
    String sction;
    int marks;

    @Override
    public String toString() {
        return "id" + id +", name :"+ name +", section "+ sction +", marks "+ marks;
    }


}
class StudntNofoun extends Exception{
    
}
public class Solution {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Anil", "A", 100);
        Student s2 = new Student(2, "Suresh", "A", 200);
        Student s3 = new Student(3, "Neelabh", "B", 110);
        Student s4 = new Student(4, "Mohan", "C", 90);
        Student s5 = new Student(5, "Ram", "C", 80);
        List<Student> list = List.of(s1, s2, s3, s4, s5);
        list.stream().collect(Collectors.groupingBy(s -> s.sction)).entrySet().stream().forEach(System.out::println);
        ExecutorService executorService = Executors.newCachedThreadPool();


    }


}
