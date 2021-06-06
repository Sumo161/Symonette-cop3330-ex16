package ex16;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nyles Symonette
 */


import java.util.*;
public class App {
    public static void main(String[] args){
        int age;
        Scanner sc = new Scanner(System.in);
        // object created of scanner to read input
        System.out.print("What is your age? ");

        age = sc.nextInt();
        if(age>=16)
            System.out.println("you're old enough to legally drive");
        else
            System.out.println("you're not old enough to legally drive");
    }
}
