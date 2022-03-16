// To calculate Fibonacci Series up to n numbers.

import java.util.*;

public class fibonacci {
  public static void main(String ags[]){
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a=0,b=1,c;
      for(int i=1;i<=n;i++)
      {
         System.out.println(a);
         c=a+b;
         a=b;
         b=c;
      }
      s.close();
  }  
}
