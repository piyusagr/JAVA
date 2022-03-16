// To find Armstrong Number between two given number.

import java.util.*;

public class armstrong {
      public static void main(String ags[]){
          Scanner s=new Scanner(System.in);
          int t=s.nextInt();
          int r=t;
          int rev=0;
          int a=0;
          while(r>0)
          {
             rev=r%10;
             a+=(Math.pow(rev,3));
             r/=10;
          }
          if(t==a){
              System.out.println(t+" is armstrong number");
          }
          else
             System.out.println(t+" is not armstrong number");
          s.close();
      }  
}
