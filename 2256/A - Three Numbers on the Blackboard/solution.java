import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int[] arr=new int[3];
            arr[0]=sc.nextInt();
            arr[1]=sc.nextInt();
            arr[2]=sc.nextInt();
            Arrays.sort(arr);
            int irange=arr[2]-arr[0];
            int range=arr[1];
            System.out.println(Math.min(irange,range));
        }
    }
}