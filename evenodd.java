// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.*;

public class evenodd{
    public static void main(String ags[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%2==0)
              System.out.println(a+" is the even nuber ");
        else 
              System.out.println(a+" is odd number.");
        s.close();
    }
}