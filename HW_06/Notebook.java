package HW_06;

import java.util.UUID;

public class Notebook {

    //Main parametrs
    private int serialNumber;

    String nameModel;
    int valueHDD;
    int valueRAM;
    String colorBody;
    String typeOS;

    public int getSerialNumber() {
        return serialNumber;
    }


    public Notebook (String nameModel, int valueHDD, int valueRAM, String colorBody, String typeOS){
        this.serialNumber = generateUniqueId();
        this.nameModel = nameModel;
        this.valueHDD = valueHDD;
        this.valueRAM = valueRAM;
        this.colorBody = colorBody;
        this.typeOS = typeOS;
    }
    
    public String toString() {
        return "Model: " + nameModel + ";   HDD (GB): " + valueHDD + ";   RAM (GB): " + valueRAM + ";   OS: " + typeOS + ";   Color: " + colorBody;
    }
    
    public static int generateUniqueId() {      
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;        
        int uid=str.hashCode();
        String filterStr=""+uid;
        str=filterStr.replaceAll("-", "");
        return Integer.parseInt(str);
    }
}
