/**
* В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
*/
package L1;

import java.time.LocalDateTime;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Hello. What its your name? ");
    String userName = iScanner.next();
    iScanner.close();
    String helloPhrase = "";
    int hours = LocalDateTime.now().getHour();
    if (hours >= 5 && hours <= 11){
    helloPhrase = "Good morning, ";
    }
    else if (hours >= 12 && hours <= 17){
        helloPhrase = "Good day, ";
    }
    else if (hours >= 18 && hours <= 22){
        helloPhrase = "Good evening, ";
    }
    else if ((hours >= 23 && hours <= 24) || (hours >= 0 & hours <= 4)){
        helloPhrase = "Good night, ";
    }
    else
        helloPhrase = "I dont know what time its now, ";
           
    System.out.println(helloPhrase + userName);
    }
}
   