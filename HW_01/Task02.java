//Вывести все простые числа от 1 до 1000

package HW_01;

public class Task02 {
    public static void main(String[] args) {
        
        System.out.printf("Print prime numbers: ");
        boolean flag = false;
        for (int i = 1; i <= 1000; i++){
            if (i == 1){
                flag = true;
            }
            for (int j = 2; j <= i; j++){
                if (j == i){
                    flag = true;
                    break;
                }
                if (i % j == 0){
                    flag = false;
                    break;
                }    
            }         
            if (flag == true){
                System.out.printf(i + ", ");
            }
        }
        System.out.printf("END");
        System.out.println(" ");
    }


}
    

