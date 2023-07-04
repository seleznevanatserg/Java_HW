
// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, начиная с c1.

package L2;

public class l2t1 {
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();

    String c1 = "a";
    String c2 = "b";
    int n = 100;
    for (int i = 0; i < n/2; i++) {
    sb.append(c1);
    sb.append(c2);
    }
System.out.println(sb);
}
}
