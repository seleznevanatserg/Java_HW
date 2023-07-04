// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

package L4;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class l4t2 {
    public static void main(String[] args) {
    
    LinkedList<String> originLList = new LinkedList<String>();
    for (int i = 0; i < 10; i ++){
        originLList.add("java-" + i );
    }
    System.out.println(Arrays.toString(originLList.toArray()));
    LinkedList<String> NewLList = UserInputInLL (originLList);
    System.out.println(Arrays.toString(NewLList.toArray()));

    }
    public static LinkedList<String> UserInputInLL (LinkedList<String> LList){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Hello. Enter message format [text]~[num]?: ");
        String userInputMsg = iScanner.next();
        iScanner.close();

        String[] InputMsgSplit = userInputMsg.split("~");
        if (InputMsgSplit[0].equals("print") == false){
            LList.add(Integer.parseInt(InputMsgSplit[1]), InputMsgSplit[0]);
        }
        else{
            System.out.println(LList.get(Integer.parseInt(InputMsgSplit[1])));
            LList.remove(Integer.parseInt(InputMsgSplit[1]));
        }
            
        return LList;
    }
}
