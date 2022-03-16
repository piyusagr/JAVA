// Input a number and print all the factors of that number (use loops).

import java.util.*;

// import javax.crypto.interfaces.PBEKey;

public class factors {
       public static void main(String sums[]){
            Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            System.out.println("the factor of the number is ");
            for(int i=1;i<=a;i++)
            {
                if(a%i==0)
                    System.out.println(i);
            }
            s.close();
        }
}