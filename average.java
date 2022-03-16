//calculate the average of n number

import java.util.*;

public class average {
    public static void main(String ags[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
            sum+=ar[i];
        }
        System.out.println("the average of total number is "+sum/n);
        s.close();
    }
}
