package L2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class l2t3 {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathDir = pathProject.concat("/L2");
        File dir = new File(pathDir);
        String fileName = "L2/l2t3.txt";
        System.out.println(dir.getAbsolutePath());
        for (String fname : dir.list()) {
            UserFileWriter (fileName,fname);
        }      
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
}
