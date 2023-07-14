// Пусть дан список сотрудников:
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Иван Савин
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

// Иван 4, ...

package HW_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Task02 {
    public static void main(String[] args) {
        String file = "HW_05/Task02.txt";
        List<String> nameAndSurnameEmployees = new ArrayList<String>();

        //reading file and write in Array
        try (FileReader notation = new FileReader(file)) {
            BufferedReader br = new BufferedReader(notation);
            String line = "";
            while((line = br.readLine()) != null) {
                nameAndSurnameEmployees.add(line);
            }
            br.close();
        } 
        catch (IOException e) {
            System.out.println(e.toString());
        } 

        //selected NAME and write in Map
        Map<String, Integer> counterNames = new HashMap<String, Integer>();
        for (int i = 0; i < nameAndSurnameEmployees.size(); i++){
            String [] str = nameAndSurnameEmployees.get(i).split(" ");
            if (counterNames.containsKey(str[0])){
                counterNames.put(str[0], counterNames.get(str[0]) + 1); 
            }
            else{
                counterNames.put(str[0], 1); 
            }
        }
        
        // origin Map sorted 
        Map<String, Integer> counterNamesSorted = new LinkedHashMap<String, Integer> ();
        List<Integer> values = new ArrayList<Integer>(counterNames.values());

        int maxValue = 0;
        for (int i = 0; i < values.size(); i++){
            if (maxValue < values.get(i)){
                maxValue = values.get(i);
            }
        }

        List<String> keys = new ArrayList<String>(counterNames.keySet());

        while (maxValue > 0){
            for (int i = 0; i < keys.size(); i++){
                if (counterNames.get(keys.get(i)) == maxValue){
                    counterNamesSorted.put(keys.get(i), maxValue);                   
                }
            }
            maxValue--;
        }
        System.out.println(counterNames);
        System.out.println(counterNamesSorted);


    }     
}



