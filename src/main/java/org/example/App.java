package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //BAC = (A × 5.14 / W × r) − .015 × H
        //0.73 for men
        // 0.66 for women
        double r=0;
        double BAC=0;
        String drive;

        //get the gender
        Scanner g = new Scanner(System.in);
        System.out.print("Enter 1 for male, 2 for female ");
        int gender = g.nextInt();
        //oz alchohol
        Scanner o = new Scanner(System.in);
        System.out.println("How much alchohol was consumed in ounces?");
        float A = o.nextFloat();
        System.out.println(A);
        //weight
        Scanner w = new Scanner(System.in);
        System.out.println("What is your weight in pounds?");
        float W = w.nextFloat();
        System.out.println(W);
        //hours since
        Scanner h = new Scanner(System.in);
        System.out.println("How long has it been since the alchohol was drunk?");
        float H = h.nextFloat();
        System.out.println(H);

        if(gender == 1){
            r=0.73;
            BAC = A*5.14/W*r-(.015*H);


        }
        else if(gender == 2){

            r=0.66;
            BAC = A*5.14/W*r-(.015*H);

        }
        else System.out.println("Invalid input");
        System.out.printf("\nYour BAC is: %f\n", BAC);
        //drive???
        drive = BAC>.08?"It is illegal for you to drive":"It is legal for you to drive";
        System.out.println(drive);


    }
}
