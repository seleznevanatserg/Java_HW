// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди. 


package L4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class l4t3 {
    public static void main(String[] args) {
    
        LinkedList<String> originLList = new LinkedList<String>();
        for (int i = 0; i < 10; i ++){
            originLList.add("j" + i );
        }
        System.out.println(Arrays.toString(originLList.toArray()));

        Stack<String> userStack = new Stack<String>();
        for (String i: originLList){
            userStack.push(i);
        }
        System.out.println(Arrays.toString(userStack.toArray()));

        Queue<String> userQueue = new LinkedList<String>();
        for (String i: originLList){
            userQueue.add(i);
        }
        System.out.println(Arrays.toString(userQueue.toArray()));
    }

    
}

