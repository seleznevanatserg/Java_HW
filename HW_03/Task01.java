// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

package HW_03;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Task01 {
    public static void main(String[] args) {

        ArrayList<Integer> newRandomArr = new ArrayList<Integer>();

        for (int i = 0; i < 10; i ++){
            int randomNum = ThreadLocalRandom.current().nextInt(1, 20);
            newRandomArr.add(randomNum);
        }

        System.out.println("Origin Array: " + newRandomArr.toString());


        ArrayList<Integer> arrWithoutEvenNumbers = new ArrayList<Integer>(newRandomArr);

        for (int i = 0; i < arrWithoutEvenNumbers.size(); i ++){
            if (arrWithoutEvenNumbers.get(i) % 2 == 0){
                arrWithoutEvenNumbers.remove(i);
                i--;
            }
        }

        System.out.println("Origin Array without even numbers: " + arrWithoutEvenNumbers.toString());

        int maxArr = newRandomArr.get(0);;
        int minArr = newRandomArr.get(0);;
        double avgArr = 0;

        for (int i = 0; i < newRandomArr.size(); i ++){
            if (maxArr < newRandomArr.get(i)){
                maxArr = newRandomArr.get(i);
            }
            if (minArr > newRandomArr.get(i)){
                minArr = newRandomArr.get(i);
            }
            avgArr = avgArr + newRandomArr.get(i);
        }
        avgArr = avgArr / newRandomArr.size();
        
        System.out.println("Max number in Origin Array: " + maxArr);
        System.out.println("Min number in Origin Array: " + minArr);
        System.out.println("Average (mean) in Origin Array: " + avgArr);

    }  
}
