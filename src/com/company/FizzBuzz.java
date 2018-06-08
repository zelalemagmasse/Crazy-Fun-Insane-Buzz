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
        String[] paperSciss= new String[5];
        paperSciss[0] = "Rock";
        paperSciss[1]="paper";
        paperSciss[2]="Scissors";
        paperSciss[3]="Lizard";
        paperSciss[4]="Spock";

        if (rangeChecker(smallNum, bigNum)) {
            fizBuzCount.add("This won't take long");
            if (smallNum == bigNum) {
                fizBuzCount.add("Shazam");
            } else {
                for (int i = smallNum,j=0; i <= bigNum && j < paperSciss.length; i++,j++) {
                    if (i % 2 == 0 && i>10) {

                        if (i % 3 == 0) {
                            if (i % 5 == 0) {
                                String magicWord="FizzBuzz " + paperSciss[j];
                                fizBuzCount.add(magicWord);
                            } else {
                                String magicWord="Fizz " + paperSciss[j];
                                fizBuzCount.add(magicWord);
                            }

                        } else if (i % 5 == 0) {
                            if (i % 3 == 0) {
                                String magicWord="FizzBuzz " + paperSciss[j];
                                fizBuzCount.add(magicWord);
                            } else {
                                String magicWord = "Buzz " + paperSciss[j];
                                fizBuzCount.add(magicWord);
                            }
                        } else if (i % 7 == 0) {
                            String iValue = String.valueOf(i);
                            String combIvalu = iValue.concat(" -this number is a multiple of seven ");
                            String magicWord=combIvalu +" "+ paperSciss[j];
                            fizBuzCount.add(magicWord);
                        } else {
                            String iValue = String.valueOf(i);
                            String magicWord = iValue + paperSciss[j];

                            fizBuzCount.add(magicWord);
                        }
                        if(j==paperSciss.length-1)
                            j=-1;
                    }
                    else
                    {
                        if (i % 3 == 0) {
                            if (i % 5 == 0) {
                                fizBuzCount.add(" FizzBuzz");
                            } else
                                fizBuzCount.add(" Fizz");

                        } else if (i % 5 == 0) {
                            if (i % 3 == 0) {
                                fizBuzCount.add(" FizzBuzz");
                            } else

                                fizBuzCount.add(" Buzz ");
                        } else {
                            AddInFizBuzz(fizBuzCount, i);
                        }
                    }
                }
            }

        }
        else{

            if (smallNum == bigNum) {
                fizBuzCount.add("Shazam");
            } else {
                for (int i = smallNum,j=0; i <= bigNum && j < paperSciss.length; i++,j++) {
                    if (i % 2 == 0 && i>10) {

                        if (i % 3 == 0) {
                            if (i % 5 == 0) {
                                String magicWord=" FizzBuzz " + paperSciss[j];
                                fizBuzCount.add(magicWord);
                            } else {
                                String magicWord=" Fizz" + paperSciss[j];
                                fizBuzCount.add(magicWord);
                            }

                        } else if (i % 5 == 0) {
                            if (i % 3 == 0) {
                                String magicWord=" FizzBuzz " + paperSciss[j];
                                fizBuzCount.add(magicWord);
                            } else {
                                String magicWord = " Buzz " + paperSciss[j];
                                fizBuzCount.add(magicWord);
                            }
                        } else if (i % 7 == 0) {
                            String iValue = String.valueOf(i);
                            String combIvalu = iValue.concat(" -this number is a multiple of seven");
                            String magicWord=combIvalu + " " + paperSciss[j];
                            fizBuzCount.add(magicWord);
                        } else {
                            String iValue = String.valueOf(i);
                            String magicWord = iValue +" "+ paperSciss[j];

                            fizBuzCount.add(magicWord);
                        }
                        if(j==paperSciss.length-1)
                            j=-1;
                    }
                    else
                    {
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
                        } else AddInFizBuzz(fizBuzCount, i);
                    }
                }
            }


        }
        return fizBuzCount;
    }

    private void AddInFizBuzz(ArrayList fizBuzCount, int i) {
        if (i % 7 == 0) {
            String iValue = String.valueOf(i);
            String combIvalu = iValue.concat(" -this number is a multiple of seven");
            fizBuzCount.add(combIvalu);
        } else

            fizBuzCount.add(i);
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