// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.*;

public class calculateifelse {
    public static void main(String[] ags){
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
        float b=s.nextFloat();
        float sum;
        String operator=s.next();
        if(operator=="+") {
            sum=a+b;
            System.out.println("the sum of 2 number is "+sum);
        }
        else if(operator=="-")
        {
            System.out.println("the substract of 2 number is "+(a-b));
        }
        else if(operator=="*")
            System.out.println("the mutiply is "+a*b);
        else if(operator=="/")
            System.out.println("the divide is "+a/b);
        s.close();
    }    
}
