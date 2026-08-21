import java.util.Arrays;
import java.util.Scanner;
//766B
public class MahmoudandaTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n-2;i++){
            if((long)a[i]+a[i+1]>a[i+2]){
                System.out.println("YES");
                sc.close();
                return;
            }
        }
        System.out.println("NO");
        sc.close();
    }
}