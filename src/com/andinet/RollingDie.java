package com.andinet;


import java.util.Random;

public class RollingDie {

    public static void main(String[] args) {

        System.out.println("My Die game");
        //create a Randon object
        Random random=new Random();
        int num=random.nextInt(6)+1;
        System.out.println(num);
	// write your code here
    }
}
