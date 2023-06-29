//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HW_01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Hello. Enter number: ");
        String enteredString = iScanner.next();
        int userNumber = Integer.parseInt(enteredString);
        iScanner.close();

        int triangleNumber = 0;
        int fractalNumber = 0;
        if (userNumber == 0){
            triangleNumber = 0;
            fractalNumber = 1;
        }
        else if (userNumber == 1){
            triangleNumber = 1;
            fractalNumber = 1;
        }
        else if (userNumber > 1){
            // N triangle number
            triangleNumber = userNumber;  
            for (int i = userNumber - 1; i > 0; i--){
                triangleNumber = triangleNumber + i;
            }
            
            //N fractal
            fractalNumber = userNumber;  
            for (int i = userNumber - 1; i > 0; i--){
                fractalNumber = fractalNumber * i;
            }
        }
        else{
            System.out.println("Sorry, negative number");
        }

        System.out.println("N (entered number) triangle number: " + triangleNumber);
        System.out.println("N (entered number) fractal number: " + fractalNumber);
    }
}
