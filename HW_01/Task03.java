package HW_01;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Hello. Its simple calculator.");
        System.out.printf("Enter first number A: ");
        Float numberA = iScanner.nextFloat();
        System.out.printf("Enter second number B: ");
        Float numberB = iScanner.nextFloat();
        System.out.printf("Select action A to B (+ - x /): ");
        String actionAtoB = iScanner.next();  
        iScanner.close();

        Float result;
        
        if (actionAtoB.equals("+")){
            result = numberA + numberB;
            System.out.println("A " + actionAtoB + " B = " + result);  
        }
        else if (actionAtoB.equals("-")){
            result = numberA - numberB;
            System.out.println("A " + actionAtoB + " B = " + result);  
        }
        else if (actionAtoB.equals("x")){
            result = numberA * numberB;
            System.out.println("A " + actionAtoB + " B = " + result);  
        }
        else if (actionAtoB.equals("/")){
            result = numberA / numberB;
            System.out.println("A " + actionAtoB + " B = " + result);  
        }
        else
            System.out.println("I dont undestand.");          
    }  
}
