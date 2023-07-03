package HW_02;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Task04special {
    public static void main(String[] args) {
        
        String fileName = "HW_02/task04-log.txt";

        String msg = "Initialization: "  + "   (" + LocalDateTime.now() + ")";
        UserFileWriter(fileName, msg);
        Scanner iScanner = new Scanner(System.in);

        msg = "Hello. Its simple calculator.";
        System.out.println(msg);
        UserFileWriter(fileName, msg);

        msg = "Enter first number A: ";
        System.out.printf(msg);
        UserFileWriter(fileName, msg);
        Float numberA = iScanner.nextFloat();
        msg = "[user entered]: " + numberA + "   (" + LocalDateTime.now() + ")";
        UserFileWriter(fileName, msg);

        msg = "Enter first number B: ";
        System.out.printf(msg);
        UserFileWriter(fileName, msg);
        Float numberB = iScanner.nextFloat();
        msg = "[user entered]: " + numberB + "   (" + LocalDateTime.now() + ")";
        UserFileWriter(fileName, msg);

        msg = "Select action A to B (+ - x /): ";
        System.out.printf(msg);
        UserFileWriter(fileName, msg);
        String actionAtoB = iScanner.next();  
        msg = "[user entered]: " + actionAtoB + "   (" + LocalDateTime.now() + ")";
        UserFileWriter(fileName, msg);
        iScanner.close();

        Float result;
        
        if (actionAtoB.equals("+")){
            result = numberA + numberB;
            msg = "A " + actionAtoB + " B = " + result; 
        }
        else if (actionAtoB.equals("-")){
            result = numberA - numberB;
            msg = "A " + actionAtoB + " B = " + result;

        }
        else if (actionAtoB.equals("x")){
            result = numberA * numberB;
            msg = "A " + actionAtoB + " B = " + result; 
        }
        else if (actionAtoB.equals("/")){
            result = numberA / numberB;
            msg = "A " + actionAtoB + " B = " + result;  
        }
        else
            msg = "I dont undestand.";
        
        System.out.println(msg);
        UserFileWriter(fileName, msg);
        
        msg = "END "  + "   (" + LocalDateTime.now() + ")";
        UserFileWriter(fileName, msg);
        msg = "-------------------------------------------------------------------------------";
        UserFileWriter(fileName, msg);
    }  

    public static void UserFileWriter(String fileName, String inputString){
        try (FileWriter notation = new FileWriter(fileName, true)) {
            notation.append(inputString + '\n');
            notation.close();
        } 
        catch (IOException e) {
            System.out.println(e.toString());
        } 
    }
}