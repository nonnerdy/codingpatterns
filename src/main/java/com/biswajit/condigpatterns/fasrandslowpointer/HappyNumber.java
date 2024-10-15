package com.biswajit.condigpatterns.fasrandslowpointer;

import java.util.ArrayList;
import java.util.List;

/*
Write an algorithm to determine if a number
n
n
 is a happy number.

We use the following process to check if a given number is a happy number:

Starting with the given number
n
n
, replace the number with the sum of the squares of its digits.
Repeat the process until:
The number equals
1
1
, which will depict that the given number
n
n
 is a happy number.
It enters a cycle, which will depict that the given number
n
n
 is not a happy number.
Return TRUE if
n
n
 is a happy number, and FALSE if not.

23 -> 4 + 9 -> 13
13 -> 1 + 9 -> 10
10 -> 1 + 0 -> 1

23 happy number -> TRUE

94 -> 81 + 16 -> 97
97 -> 81 + 49 -> 130
130 -> 1 + 9 + 0 -> 10
10 -> 1 + 0 -> 1

94 happy number -> TRUE

73 -> 49 + 9 ->  58
58 -> 25 + 64 -> 89
89 -> 64 + 81 -> 145
145 -> 1 + 16 + 25 -> 42
42 -> 16 + 4 -> 20
20 -> 4 + 0 -> 4
4 -> 16
16 -> 1 + 36 -> 37
37 -> 9 + 49 -> 58

Here 58 is repeated and it will be in circular

73 happy number -> FALSE



 */
public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappyNumber(23));
    }

    private static boolean isHappyNumber(int num) {
        if (num < 1)
            return false;
        List<Integer> container = new ArrayList<>();

        int tmp = num;
        int sum = 0;

        while (tmp >= 1) {

            int var2 = tmp % 10;
            tmp = tmp / 10;
            sum = sum + (var2 * var2);


            if (container.contains(sum))
                return false;
            else if(sum == 1)
                return true;
            else if(tmp == 0) {
                tmp = sum;
                container.add(sum);
                sum = 0;
            }

        }


        return true;
    }
}
