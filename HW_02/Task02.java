package HW_02;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;


public class Task02 {

    public static void main(String[] args) {

        String fileName = "HW_02/task02-log.txt";

        String msg = "Initialization: " + LocalDateTime.now();
        UserFileWriter(fileName, msg);

        int [] simpleArray;
        simpleArray = new int [10];
        for (int i = 0; i < simpleArray.length; i ++ ){
            simpleArray[i] = ThreadLocalRandom.current().nextInt(0, 20);
        }

        //first record in log
        StringBuilder sb = new StringBuilder();
        sb.append("Origin Array: ");
        sb.append(StrBuild(simpleArray));
        UserFileWriter(fileName, sb.toString());


        //itarations records in log
        int count = 0;
        for (int i = 0; i < simpleArray.length - 1; i++) {
            for(int j = 0; j < simpleArray.length - i - 1; j++) {
                if(simpleArray[j + 1] < simpleArray[j]) {
                    int swap = simpleArray[j];
                    simpleArray[j] = simpleArray[j + 1];
                    simpleArray[j + 1] = swap;
                    
                }
                count ++;
                StringBuilder rec = new StringBuilder();
                rec.append("Iteration [" + (count) + "]: ");
                rec.append(StrBuild(simpleArray));
                UserFileWriter(fileName, rec.toString());
            }
        }

        msg = "Sort complet: " + LocalDateTime.now();
        UserFileWriter(fileName, msg);

        msg = "-------------------------------------------------------------------------------";
        UserFileWriter(fileName, msg);
    }
    



    public static void UserFileWriter(String fileName, String inputString){
        try (FileWriter notation = new FileWriter(fileName, true)) {
            notation.append(inputString + '\n');
            notation.close();
        } 
        catch (IOException e) {
            System.out.println(e.toString());
        } 
    }
    
    public static StringBuilder StrBuild (int [] array){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i ++ ){
            if (i < array.length - 1)
                sb.append(array[i] + ", ");
            else
                sb.append(array[i]);
        }
        return sb;
    }
    
}
