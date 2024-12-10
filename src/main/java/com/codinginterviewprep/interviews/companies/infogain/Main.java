package com.codinginterviewprep.interviews.companies.infogain;
/*
Given a list of integer. Find the next greater integer for each of the elements.
Eg:- arr=    {9,5,13,11,12}  n->>
                {14, 12, 11, 13}
                {13, 11, 12, 14}

                [14,


    14,      13
     output={13,13,-1,12,-1}

   13
     12
     -,

Given a list of infinite supply of coins. Find minimum no of coins to reach an amount.
Eg;coins[]={9,5,6,1} , target=11.
Ans :2

target - array[i],  target, i+1

All employee not presnt in ssalary

select * from Employee where id not in (select employee_id from salary)

select * from Employee where id not in (select employee.id from Employee right inner join Salary on Empplouyee.id == Salary.employee_id)
select employee.id from Employee as e left inner join Salary  as s where

 */
public class Main {
    public static void main(String[] args) {

    }

    public static int getTotalCoinCount(int [] coins, int target, int index){
        if(target == 0 || index == coins.length){

        }

        return getTotalCoinCount(coins, target -coins[index] ,  index) + getTotalCoinCount(coins, target, index+1);
    }

}
