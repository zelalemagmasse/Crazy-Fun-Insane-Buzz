package com.company;
import java.util.Random;
import java.util.ArrayList;

public class FizzBuzz {

    private int smallNum;
    private int bigNum;

    public int getSmallNum() {
        return smallNum;
    }

    public int getBigNum() {
        return bigNum;
    }

    public ArrayList fizBuzDisplay(){
        ArrayList fizBuzCount = new ArrayList();
        Random bigEnd=new Random();

        int bign=1 + bigEnd.nextInt(99);
        int endn=1 + bigEnd.nextInt(99);



        smallNum=intSmallerComparator(bigNum,endn);
        bigNum=intGreaterComparator(bign,endn);

        if(smallNum==bigNum){
            fizBuzCount.add("Shazam");
        }
        else {

            for (int i = smallNum; i <= bigNum; i++) {
                if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        fizBuzCount.add("FizzBuzz");
                    } else
                        fizBuzCount.add("Fizz");

                } else if (i % 5 == 0) {
                    if (i % 3 == 0) {
                        fizBuzCount.add("FizzBuzz");
                    } else

                        fizBuzCount.add("Buzz");
                } else

                    fizBuzCount.add(i);
            }
        }
        return fizBuzCount;
    }

    private int intGreaterComparator(int randNum1,int randNum2){
        if(randNum1>randNum2)
            return randNum1;
        else return randNum2;
    }
    private int intSmallerComparator(int randNum1,int randNum2){
        if(randNum1>randNum2)
            return randNum2;
        else return randNum1;
    }
}