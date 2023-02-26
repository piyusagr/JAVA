// Take 2 numbers as input and print the largest number.

import java.util.*;

public class largest {
    public static void main(String ags[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>b)
            System.out.println("This "+a+" is Greater than "+b);
        else
            System.out.println("This"+b+" is Greater than "+a);
            s.close();
    }    
}
