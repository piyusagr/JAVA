//calculate commission percentage

import java.util.*;

public class commisper {
    public static void main(String ags[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(((b-a)*100)/b+"% is the commision pecentage teken ny ");
        s.close();
    }
}
