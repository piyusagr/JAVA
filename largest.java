// Take 2 numbers as input and print the largest number.

import java.util.*;

public class largest {
    public static void main(String ags[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>b)
            System.out.println(a+" is greater than "+b);
        else
            System.out.println(b+" is greater than "+a);
            s.close();
    }    
}
