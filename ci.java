//compounf interesr java program

import java.util.*;

public class ci {
    public static void main(String ads[]){
        Scanner s=new Scanner(System.in);
        double p=s.nextDouble();
        double t=s.nextDouble();
        double r=s.nextDouble();
        double n=s.nextDouble();
        double c=p*(Math.pow((1+(r/n)),(n*t)));
        System.out.println("the compund interset is : "+c);
        s.close();
    }
}
