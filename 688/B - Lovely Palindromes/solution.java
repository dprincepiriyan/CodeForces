import java.util.Scanner;
//688B
public class LovelyPalindromes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder(s);
        System.out.print(s);
        System.out.print(sb.reverse().toString());
        sc.close();
    }
}