package com.codinginterviewprep.interviews.companies.infogain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
val name = neelabh.singh@abc.co.in
select * from Employee where Employee.email like ''
Table1(id), Table2(id)
select * from Table1 where id not in (select id from Table2);
 */
public class Test {
    public static Test testInstance;
    private Test(){
        System.out.println("This Singleton Object");
    }
    public static Test getInstance(){
        if(testInstance == null){
            synchronized (Test.class){
                if(testInstance == null){
                    testInstance = new Test();
                }
            }
        }
        return testInstance;
    }
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2, 3, 4, 1, 7, 5, 6);
        int secondSmallest = nums.stream().sorted().limit(2).collect(Collectors.toList()).get(1);
        System.out.println(secondSmallest);
        System.out.println(numberOfSteps(6));

    }
    private static int numberOfSteps(int steps){
        if(steps == 0 || steps == 1){
            return 1;
        }
        return numberOfSteps(steps - 1) + numberOfSteps(steps - 2);
    }
}
