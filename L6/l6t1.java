// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24. 
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и 
// верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

package L6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class l6t1 {
    public static void main(String[] args) {
        ArrayList<Integer> newRandomArr = new ArrayList<Integer>();
        for (int i = 0; i < 100; i ++){
            int randomNum = ThreadLocalRandom.current().nextInt(0, 25);
            newRandomArr.add(randomNum);
    }
    //System.out.println(newRandomArr.toString());
    System.out.println(checkNumber(newRandomArr));


}
    public static float checkNumber (ArrayList<Integer> arr){
        Set<Integer> setArr = new HashSet<Integer>(arr);
        System.out.println(setArr);
        float result = (float)setArr.size() * 100 / arr.size();
        
        return result;
    }
}
