// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь


package L5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class l5t2 {
    public static void main(String[] args) {
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("Hello. Enter text: ");
        // String enteredString = iScanner.next();
        // iScanner.close();
        
        String enteredString = "{a+a+a+a}[+]{(d*3)}=[[[[[=]]]]]";

        Map<Character, Integer> db = new HashMap<Character, Integer>();
        System.out.println(enteredString);

        for (int i = 0; i < enteredString.length(); i++){          
            if (db.containsKey(enteredString.charAt(i))){
                db.put(enteredString.charAt(i), db.get(enteredString.charAt(i))+1); 
            }
            else{
                db.put(enteredString.charAt(i), 1); 
            }
        }
        System.out.println(db.get('{'));

        System.out.print(db + "\n");
        if ((db.get('{') == db.get('}')) && (db.get('(') == db.get(')')) && (db.get('[') == db.get(']'))){
            System.out.println("Запись верная");
        }
        else{
            System.out.println("У вас ошибка. Проверьте скобки"); 
        }   
    } 
}
