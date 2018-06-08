package com.company;



public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzzPointer=new FizzBuzz();

        for (Object retriv : fizzBuzzPointer.fizBuzDisplay()) {
            System.out.println(retriv);
        }
    }

}
