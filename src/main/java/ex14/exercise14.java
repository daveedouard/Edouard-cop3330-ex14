/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex14;

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String amt = input.nextLine();
        double amount = Double.parseDouble(amt);
        System.out.print("What is the state? ");
        String state = input.nextLine();

        if(state.equals("WI")){
            double tax = 0.055*amount;
            double total = tax+amount;

            System.out.print("The subtotal is $"+String.format("%.2f",amount)+"\nThe tax is $"+String.format("%.2f",tax)+"\nThe total is $"+String.format("%.2f",total));
        }
        else if(state != "WI"){
            System.out.print("The total is $"+String.format("%.2f",amount));
        }
    }
}

