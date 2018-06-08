package com.company;
import java.util.Random;
import java.util.ArrayList;

public class FizzBuzz {

    private int smallNum;
    private int bigNum;



    public ArrayList fizBuzDisplay() {
        ArrayList fizBuzCount = new ArrayList();
        Random bigEnd = new Random();

        int bign = 1 + bigEnd.nextInt(99);
        int endn = 1 + bigEnd.nextInt(99);


        smallNum = intSmallerComparator(bign, endn);
        bigNum = intGreaterComparator(bign, endn);

        if (rangeChecker(smallNum, bigNum)) {
            fizBuzCount.add("This won't take long");
            if (smallNum == bigNum) {
                fizBuzCount.add("Shazam");
            } else {

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
                    } else if (i%7==0){
                        String iValue=String.valueOf(i);
                        String combIvalu=iValue.concat(" -this number is a multiple of seven");
                        fizBuzCount.add(combIvalu);
                    }
                    else

                        fizBuzCount.add(i);
                }
            }
            //return fizBuzCount;
        }
        else{

            if (smallNum == bigNum) {
                fizBuzCount.add("Shazam");
            } else {

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
                    }  else if (i%7==0){
                        String iValue=String.valueOf(i);
                        String combIvalu=iValue.concat(" -this number is a multiple of seven");
                        fizBuzCount.add(combIvalu);
                    }
                    else

                        fizBuzCount.add(i);
                }
            }
            //return fizBuzCount;

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
    public boolean rangeChecker(int smallNum,int bigNum){
        if(bigNum-smallNum<10)
            return true;
        else
            return false;
    }

}