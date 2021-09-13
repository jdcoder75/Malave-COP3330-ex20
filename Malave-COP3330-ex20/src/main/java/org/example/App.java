package org.example;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Jose Malave
 */
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double wisconTax = 0.05;
        final double illinoisTax = 0.08;
        final double EU_Tax =  0.005;
        final double dunnTax =  0.004;

        System.out.println("What is the order amount?  ");
        String orderIn = sc.nextLine();

        System.out.println("What state do you live in? ");
        String stateIn = sc.nextLine();

        System.out.println("What state do you live in? ");
        String countyIn = sc.nextLine();

        double order = Integer.parseInt(orderIn);

        double total;

        if (stateIn.contains("Wisconsin"))
        {
            double tax = (order * wisconTax * 100)/100;
            if(countyIn.contains("Eau Clair"))
            {
                tax = tax + (order * dunnTax);
                total = tax + order;
                System.out.println("The tax is $"+total+"\n" +
                        "The total is $" + order +" ");
            }
            else if (countyIn.contains("Eau Clair"))
            {
                tax = tax + (order * EU_Tax);
                total = tax + order;
                System.out.println("The tax is $"+total+"\n" +
                        "The total is $" + order +" ");
            }
        }
        else if (stateIn.contains("Illinois"))
        {
            double tax = (order * illinoisTax * 100)/100;
            total = tax + order;
            System.out.println("The tax is $"+total+"\n" +
                    "The total is $" + order +" ");
        }
        else
        {
            total = order;
            System.out.println("The total is $" + order +" ");
        }

    }

}
