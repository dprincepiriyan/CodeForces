import java.util.Scanner;
//139A
public class PetrandBook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] days=new int[7];
        for(int i=0;i<7;i++){
            days[i]=sc.nextInt();
        }
        int j=0;
        while(n>0){
            n-=days[j];
            if(n<=0){
                break;
            }
            j=(j+1)%7;
        }
        System.out.println(j+1);
        sc.close();
    }
}