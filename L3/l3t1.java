// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.

package L3;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class l3t1 {
    public static void main(String[] args) {

        ArrayList<Integer> newRandomArr = new ArrayList<Integer>();

        for (int i = 0; i < 10; i ++){
            int randomNum = ThreadLocalRandom.current().nextInt(0, 20);
            newRandomArr.add(randomNum);
        }
        
        System.out.println(newRandomArr.toString());

        newRandomArr.sort(null);
        System.out.println(newRandomArr.toString());
    }  
}

