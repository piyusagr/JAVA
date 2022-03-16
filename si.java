// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;
public class si{
    public static void main(String[] ags){
        Scanner s=new Scanner(System.in);
        float p=s.nextFloat();
        float t=s.nextFloat();
        float r=s.nextFloat();
        float interest=(p*t*r)/100;
        System.out.println("the simple interest is: "+interest);
        s.close();
    }
}