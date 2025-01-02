package Exceptions;

import java.util.Scanner;



public class Ex1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        boolean value = true;
        while(value){
        System.out.println("Numerator");
        int num = scan.nextInt();
        System.out.println("Denomi1nator");
        int den = scan.nextInt();
        try{
                int result = num/den;
                System.out.println("Answer: "+result);}
        catch(ArithmeticException e) {
            System.out.println("Please dont enter zero as denominator");

        } }   }}



