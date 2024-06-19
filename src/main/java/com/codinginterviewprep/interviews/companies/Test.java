package com.codinginterviewprep.interviews.companies;


/*
Given Value of C, value of A and B, A,B C are the side of Right angle trangle and C is lonest side.
possible value of A and B.

array [] = {0, 0, 1, 0 2, 1}
 */
public class Test {
    public static void main(String[] args) {
        int array [] = {0, 0, 1, 0, 2, 1};
        int start =0;
        int end = array.length -1;
        int mid = 0;
        while (start < end){
            switch (array[mid]){
                case 0: start++;
                        mid++;
                        break;
                case 1:

            }
        }
    }
}
