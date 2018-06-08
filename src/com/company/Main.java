package com.company;

public class Main {


    public static void main(String[] args) {

        FizzBuzz fizzBuzzPointer=new FizzBuzz();
        for(int i=0;i<fizzBuzzPointer.fizBuzDisplay().size();i++){
            System.out.println(fizzBuzzPointer.fizBuzDisplay().get(i));
        }


    }
}