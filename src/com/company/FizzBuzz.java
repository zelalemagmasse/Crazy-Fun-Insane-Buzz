package com.company;

import java.util.ArrayList;

public class FizzBuzz {
    public ArrayList fizBuzDisplay(){
        ArrayList fizBuzCount = new ArrayList();
        for(int i=1;i<=100;i++){
            if(i%3==0){
                if(i%5==0){
                    fizBuzCount.add("FizzBuzz");
                }
                else
                    fizBuzCount.add("Fizz");

            }
            else if (i%5==0){
                if(i%3==0){
                    fizBuzCount.add("FizzBuzz");
                }
                else

                    fizBuzCount.add("Buzz");
            }
            else

                fizBuzCount.add(i);
        }
        return fizBuzCount;
    }
}
