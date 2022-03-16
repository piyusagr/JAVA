// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.*;
public class sum {
    public static void main(String ads[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        while(n>0)
        {
            sum+=n;
            n--;
        }  
        System.out.println("the sum is: "+sum);
        s.close();
    }
       
}
