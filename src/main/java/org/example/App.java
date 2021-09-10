package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */
public class App 
{
    public static void main( String[] args )
    {
        double length;
        double width;
        double area;
        double numPaint;
        int numPaintInt;
        final int sqFtPerGallon = 350;
        Scanner sc = new Scanner(System.in);

        System.out.print( "What is the length of the ceiling? ");
        length = sc.nextDouble();

        System.out.print("What is the width of the ceiling? ");
        width = sc.nextDouble();

        area = length * width;
        numPaint = area/sqFtPerGallon;
        numPaintInt = (int)numPaint;

        if(numPaintInt < numPaint)
        {
            numPaintInt++;
            System.out.println("You will need to purchase " + numPaintInt + " gallons of paint to cover " + area + " square feet.");
        }
        else
        {
            System.out.println("You will need to purchase" + numPaintInt + " gallons of paint to cover " + area + " square feet.");
        }

    }
}
