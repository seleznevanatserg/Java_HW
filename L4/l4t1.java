// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

package L4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class l4t1 {
    
    public static void main(String[] args) {
        long startTimeAL = System.nanoTime();
        ArrayList<Integer> newRandomArr = new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i ++){
            int randomNum = ThreadLocalRandom.current().nextInt(0, 20);
            newRandomArr.add(randomNum);
        }
        long endTimeAL = System.nanoTime();
        long durationAL = (endTimeAL - startTimeAL);
        System.out.println(durationAL);

        long startTimeLL = System.nanoTime();
        LinkedList<Integer> newRandomLList = new LinkedList<Integer>();
        for (int i = 0; i < 1000000; i ++){
            int randomNum = ThreadLocalRandom.current().nextInt(0, 20);
            newRandomLList.add(randomNum);
        }
        long endTimeLL = System.nanoTime();
        long durationLL = (endTimeLL - startTimeLL);
        System.out.println(durationLL);   
}
}
