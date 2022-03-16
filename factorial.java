//factorial program in java

import java.util.*;

public class factorial {
    public static void main(String ads[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),fact=1;
        while(n>0){
             fact=fact*n;
             n--;
        }
        System.out.println("the factorial of the number is "+fact);
        s.close();
    }
}
