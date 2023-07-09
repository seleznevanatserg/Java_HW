// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
// “перевернутый” список.

package HW_04;

import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Task01 {
    public static void main(String[] args) {
        LinkedList<Integer> LList = new LinkedList<Integer>();
        for (int i = 0; i < 5; i ++){
            int randomNum = ThreadLocalRandom.current().nextInt(0, 20);
            LList.add(randomNum);
        }
        System.out.println(LList.toString());
        ReversLL(LList);
        System.out.println(LList.toString());
    }
    public static void ReversLL (LinkedList<Integer> LL){
        for (int i = 0; i < LL.size(); i ++){
            LL.add(LL.size() - i, LL.get(0));
            LL.remove(LL.get(0));
        }
    }

}

