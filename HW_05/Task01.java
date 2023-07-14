// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
package HW_05;

import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        Map<Integer, String> phoneBook = new HashMap<Integer, String>();
        phoneBook.put(123456, "Иванов Петр"); 
        phoneBook.put(321456, "Васильев Иван"); 
        phoneBook.put(234561, "Петрова Елена");
        phoneBook.put(234432, "Иванов Петр");
        phoneBook.put(654321, "Петрова Елена");
        phoneBook.put(345678, "Иванова Мария");
        
        System.out.println(phoneBook);


        
    }
}
