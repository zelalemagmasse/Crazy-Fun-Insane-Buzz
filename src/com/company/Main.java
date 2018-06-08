package com.company;



public class Main {


    public static void main(String[] args) {
        FizzBuzz fizzBuzzPointer=new FizzBuzz();
        int startNum=fizzBuzzPointer.getSmallNum();
        int endNum=fizzBuzzPointer.getBigNum();

        for(Object retriv: fizzBuzzPointer.fizBuzDisplay() ) {
            System.out.println(retriv);
        }

    }
}
