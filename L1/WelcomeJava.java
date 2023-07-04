
//Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
package L1;

import java.util.Arrays;

public class WelcomeJava {
    public static void main(String[] args) {
    String phrase = "Добро пожаловать на курс по Java";
    String [] arr  = phrase.split(" ");

    // for (int i = arr.length-1; i >= 0; i--){
    //     System.out.print(arr[i]);
    //     System.out.print(" ");
    // }
    for (String s: arr){
        System.out.print(s + " ");
    }

}}
