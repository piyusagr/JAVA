//calcu;ate the discount of product

import java.util.*;
public class disocunt {
    public static void main(String[] ags){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int d=s.nextInt();
        int dp=(d*n)/100;
        System.out.println("the discount of this product is: "+dp);
        s.close();
    }
}
