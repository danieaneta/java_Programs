//Write a program to print numbers from 1 to 10.
public class oneToTen {
    public static void main(String []args) {
        for (int i = 0; i <= 10; i++)
        System.out.println(i);
    }
}

//Write a program to calculate the sum of first 10 natural number.

public class naturalSum {
    public static void main (String []args) {
        int sum = 0;
        //init sum first in sum = 0 in order to access it within for loop
        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}

//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 

import java.util.Scanner;

public class posInt {
    public static void main(String []args){
        Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        
        System.out.println("Multiplication Table of " + num);
        
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

public class Nested {
    public static void main(String []args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++){
                System.out.print(i + "" + j);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}


public class NestedPattern{
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i += 2) {
            for (int k = 0; k < (7 - i / 2); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
