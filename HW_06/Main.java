package HW_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {

        //Create new Array instances Nootbook Class
        Map<Integer, Notebook> nb = new HashMap<Integer, Notebook>();
        

        String [] modelArray = new String[] {"NB-001", "NB-010", "NB-011", "NB-100", "NB-101", "NB-110", "NB-111"};
        Integer [] valueHDDArray = new Integer[] {64, 128, 256, 512, 1024, 2048};
        Integer [] valueRAMArray = new Integer[] {1, 2, 4, 8, 16, 32};
        String [] colorArray = new String[] {"White", "Light_Grey", "Grey", "Dark_Grey", "Black", "Yellow", "Red", "Deep_Purple"};
        String [] typeOSArray = new String[] {"Win_XP", "Win_7", "Win_10", "Linux Debian 10", "Solaris 11"};

        for (int i = 0; i < 9; i ++){
            String modelRandom = modelArray[numRandomForArray(modelArray)];
            int valueHDDRandom = valueHDDArray[numRandomForArray(valueHDDArray)];
            int valueRAMandom = valueRAMArray[numRandomForArray(valueRAMArray)];
            String colorRandom = colorArray[numRandomForArray(colorArray)];
            String typeOSRandom = typeOSArray[numRandomForArray(typeOSArray)];

            Notebook notebook = new Notebook(modelRandom, valueHDDRandom ,valueRAMandom, colorRandom, typeOSRandom);

            nb.put(notebook.getSerialNumber(), notebook);
        }




        List<Notebook> valuesNB = new ArrayList<Notebook>(nb.values());
        List<Integer> keysNB = new ArrayList<Integer>(nb.keySet());
         

        //Array menu points
        String [] mainMenu = {"Show ALL", "Select by option"};
        String [] options = {"Select by Name Model", "Select by value HDD", "Select by value RAM", "Select by Operating System", "Select by Color"};

        
        //Dialog with user
        System.out.println("+++ Hello, user. Welcome To GEKS. I have array notebooks. +++");
        int lvl = 1;
        while (lvl > 0){
            System.out.println("+++ Select menu point: +++");
            printArray(mainMenu);
            int userInput = userEnter();
            if (userInput == 0){
                System.out.println("+++ GOOD BYE +++");
                lvl = 0;
                break;
            }
            else if (userInput == 1){
                for (int i = 0; i < valuesNB.size(); i ++){
                    System.out.println(valuesNB.get(i));
                }
            }
            else if (userInput == 2){
                lvl = 2;
                while (lvl > 1){
                    printArray(options);
                    userInput = userEnter();
                    
                    if (userInput == 0){
                        lvl = 1;
                    }
                    // filter by NAME MODEL
                    else if (userInput == 1){
                        lvl = 3;
                        while (lvl > 2){
                            System.out.println("+++ Select menu point for filtration: +++");
                            printArray(modelArray);
                            System.out.println("\n");
                            userInput = userEnter();
                            if(userInput == 0){
                                lvl = 2;
                            }
                            else if ((userInput > 0) && (userInput < modelArray.length + 1)){
                                int select = userInput - 1;
                                int count = 0;
                                for (int i = 0; i < valuesNB.size(); i ++){
                                    if (modelArray[select].equals(valuesNB.get(i).nameModel)){
                                        System.out.println(nb.get(keysNB.get(i)));
                                        count ++;
                                    }
                                }
                                if (count == 0){
                                    System.out.println("+++ Nothing not found. +++");
                                }
                            }
                            else {
                                System.out.println( "+++ Uncorrect Enter. Try Again. +++ \n");
                            }
                        }
                    }
                    // filter by VALUE HDD
                    else if (userInput == 2){
                        lvl = 3;
                        while (lvl > 2){
                            System.out.println("+++ Select menu point for filtration: +++");
                            printArray(valueHDDArray);
                            System.out.println("\n");
                            userInput = userEnter();
                            if(userInput == 0){
                                lvl = 2;
                            }
                            else if ((userInput > 0) && (userInput < valueHDDArray.length + 1)){
                                int select = userInput - 1;
                                int count = 0;
                                for (int i = 0; i < valuesNB.size(); i ++){
                                    if (valueHDDArray[select] <= (valuesNB.get(i).valueHDD)){
                                        System.out.println(nb.get(keysNB.get(i)));
                                        count ++;
                                    }
                                }
                                if (count == 0){
                                    System.out.println("+++ Nothing not found. +++");
                                }
                            }
                            else {
                                System.out.println( "+++ Uncorrect Enter. Try Again. +++ \n");
                            }
                        }
                    }
                    // filter by VALUE RAM
                    else if (userInput == 3){
                        lvl = 3;
                        while (lvl > 2){
                            System.out.println("+++ Select menu point for filtration: +++");
                            printArray(valueRAMArray);
                            System.out.println("\n");
                            userInput = userEnter();
                            if(userInput == 0){
                                lvl = 2;
                            }
                            else if ((userInput > 0) && (userInput < valueRAMArray.length + 1)){
                                int select = userInput - 1;
                                int count = 0;
                                for (int i = 0; i < valuesNB.size(); i ++){
                                    if (valueRAMArray[select] <= (valuesNB.get(i).valueRAM)){
                                        System.out.println(nb.get(keysNB.get(i)));
                                        count ++;
                                    }
                                }
                                if (count == 0){
                                    System.out.println("+++ Nothing not found. +++");
                                }
                            }
                            else {
                                System.out.println( "+++ Uncorrect Enter. Try Again. +++ \n");
                            }
                        }
                    }
                    // filter by OS
                    else if (userInput == 4){
                        lvl = 3;
                        while (lvl > 2){
                            System.out.println("+++ Select menu point for filtration: +++");
                            printArray(typeOSArray);
                            System.out.println("\n");
                            userInput = userEnter();
                            if(userInput == 0){
                                lvl = 2;
                            }
                            else if ((userInput > 0) && (userInput < typeOSArray.length + 1)){
                                int select = userInput - 1;
                                int count = 0;
                                for (int i = 0; i < valuesNB.size(); i ++){
                                    if (typeOSArray[select].equals(valuesNB.get(i).typeOS)){
                                        System.out.println(nb.get(keysNB.get(i)));
                                        count ++;
                                    }
                                }
                                if (count == 0){
                                    System.out.println("+++ Nothing not found. +++");
                                }
                            }
                            else {
                                System.out.println( "+++ Uncorrect Enter. Try Again. +++ \n");
                            }
                        }
                    }
                    // filter by COLOR BODY
                    else if (userInput == 5){
                        lvl = 3;
                        while (lvl > 2){
                            System.out.println("+++ Select menu point for filtration: +++");
                            printArray(colorArray);
                            System.out.println("\n");
                            userInput = userEnter();
                            if(userInput == 0){
                                lvl = 2;
                            }
                            else if ((userInput > 0) && (userInput < colorArray.length + 1)){
                                int select = userInput - 1;
                                int count = 0;
                                for (int i = 0; i < valuesNB.size(); i ++){
                                    if (colorArray[select].equals(valuesNB.get(i).colorBody)){
                                        System.out.println(nb.get(keysNB.get(i)));
                                        count ++;
                                    }
                                }
                                if (count == 0){
                                    System.out.println("+++ Nothing not found. +++");
                                }
                            }
                            else {
                                System.out.println( "+++ Uncorrect Enter. Try Again. +++ \n");
                            }
                        }
                    }
                    else {
                        System.out.println( "+++ Uncorrect Enter. Try Again. +++ \n");
                    }
                }
            } 
            else {
                System.out.println( "+++ Uncorrect Enter. Try Again. +++");
            }
        }
    }


    // METHODS
    // method for generation random number
    public static int numRandomForArray (Object [] arr){
        int randomNum = ThreadLocalRandom.current().nextInt(0, arr.length);
        return randomNum;
    }

    // usual method for print array for display menu
    public static void printArray (Object [] arr){
        for (int i = 1; i < arr.length + 1; i++){
            System.out.println("["+ i + "]. " + arr[i-1]);
        }
        System.out.println("["+ (0) + "]. CANSEL (EXIT)");
    }

    // method read user input for navigation on menu
    public static int userEnter (){
        Scanner iScanner = new Scanner(System.in);
        int enter = iScanner.nextInt();

        return enter;
    }

}
