// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент
// из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

package HW_04;

import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Task02 {
    public static void main(String[] args) {
        LinkedList<Integer> LList = new LinkedList<Integer>();
        int randomNum = 0;
        for (int i = 0; i < 10; i ++){
            randomNum = ThreadLocalRandom.current().nextInt(0, 20);
            LList.add(randomNum);
        }
        System.out.println("Origin Array: " + LList.toString() + "\n");

        System.out.println("Origin Array: " + LList.toString());
        randomNum = ThreadLocalRandom.current().nextInt(100, 999);
        System.out.println("Element for add: " + randomNum);
        Enqueue(LList, randomNum);
        System.out.println("Resalt Array: " + LList.toString() + "\n");

        System.out.println("Origin Array: " + LList.toString());
        randomNum = Dequeue(LList);
        System.out.println("Extracted element: " + randomNum);
        System.out.println("Resalt Array: " + LList.toString() + "\n");

        System.out.println("Origin Array: " + LList.toString());
        randomNum = FirstInteger(LList);
        System.out.println("Peeked first element: " + randomNum);
        System.out.println("Resalt Array: " + LList.toString() + "\n");
    
    }
    //element(int) added on first place from LinkedList<Integer> and delete him in LL
    public static void Enqueue(LinkedList<Integer> LL, int element){
        LL.addFirst(element);
    }

    //return first element(int) from LinkedList<Integer> and delete him in LL
    public static int Dequeue(LinkedList<Integer> LL){
        int firstElementLL = LL.pollFirst();
        return firstElementLL;
    }

    //return first element(int) from LinkedList<Integer>
    public static int FirstInteger(LinkedList<Integer> LL){
        return LL.getFirst();
    }
}