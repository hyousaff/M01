// Hamza Yousaf
// SDEV JAVA
// Program demands input from user of a number it will convert and display in meters
// last modified: 9/6/2019

import java.util.Scanner;
public class M1Exercise2 {
    public static void main(String[] args) {
        System.out.println("This program will convert you value(ft) in meters(m)");
        System.out.println("Enter a number that you want to convert = ");

double num;
double meters;

Scanner input = new Scanner(System.in);
num = input.nextDouble();

meters = num * 0.305;

        System.out.println("The number you entered is = " + num +"ft");
        System.out.println("Your number in meters is = " + meters +"m");

    }
}
