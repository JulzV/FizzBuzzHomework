package com.company;

public class Main {

    public static void main(String[] args) {
        // Write a program that outputs numbers from 1 - 50
// and if the number is divisible by 3, replace it by 'Fizz' without outputing the number
// and if the number is divisible by 7, replace it by 'Buzz' without outputing the number
// and if the number is divisible by both 7 and 3 then replace it with 'FizzBuzz'
// 1
// 2
// Fizz
// 4
// 5
// Fizz
// Buzz

        for (int i = 1; i <= 50; i++) {

            if (i % 3 == 0 && i % 7 == 0  ) {
             System.out.println("FizzBuzz");
             }
            else if (i % 3 == 0 ){
                System.out.println("Fizz");
            }
            else if (i % 7 == 0 ){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
