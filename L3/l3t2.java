// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.

package L3;

import java.util.ArrayList;
import java.util.Arrays;

public class l3t2 {
   
    public static void main(String[] args) {
        ArrayList<String> solarPlanetList = new ArrayList<String>(Arrays.asList("Меркурий","Меркурий", "Pluto", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Уран", "Уран", "Венера"));
        System.out.println(solarPlanetList.toString());

        solarPlanetList.sort(null);
        System.out.println(solarPlanetList.toString());
        int count = 0;
        String planet = solarPlanetList.get(0);
        for (String item : solarPlanetList) { 
            
            if (item != planet){
                System.out.printf(planet + count + '\n');
                count = 1;
            }
            else {
                count = count + 1;
            }
            planet = item;
            //System.out.printf("planet" + planet + "count" + count + '\n');
        }

        System.out.printf(planet + count + '\n');

        //Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
        ArrayList<String> newSolarPlanetList = new ArrayList<String>();
        planet = "";
        for (String item : solarPlanetList) { 
            
            if (item != planet){
                newSolarPlanetList.add(item);
            }

            planet = item;
            //System.out.printf("planet" + planet + "count" + count + '\n');
        }
        System.out.println(newSolarPlanetList.toString());
    }  
}

