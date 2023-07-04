// Напишите метод, который составит строку, 
// состоящую из 100 повторений слова TEST и метод, 
// который запишет эту строку в простой текстовый файл, обработайте исключения.

package L2;

import java.io.FileWriter;
import java.io.IOException;

public class l2t2 {
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();

    String c1 = "TEST_";
    int n = 100;
    for (int i = 0; i < n; i++) {
    sb.append(c1);
    }
    try (FileWriter notation = new FileWriter("L2/l2log.txt", true)) {
        notation.append(sb);
        notation.close();
    } 
    catch (IOException e) {
        System.out.println(e.toString());
    }
    System.out.println(sb);
}
}
