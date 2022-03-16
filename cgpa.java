//calculate the sgpa java program

import java.util.*;

public class cgpa {
    public static void main(String ads[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String[] name=new String[n];
        float m[]=new float[n];
        float c[]=new float[n];
        float grade[]=new float[n];
        float sumg=0,sumc=0;
        for(int i=0;i<n;i++){
            System.out.println("enter the name,marks and credit of subject: "+(i+1));
            name[i]=s.next();
            m[i]=s.nextFloat();
            c[i]=s.nextFloat();
            grade[i]=m[i]/10;
            sumg=sumg+(c[i]*grade[i]);
            sumc+=c[i];
        }
        System.out.println(sumg+"\t\t"+sumc);
        System.out.println("given marksheet is");
        System.out.println("NAME\tMarks\tCredit\tgradepoint");
        for(int i=0;i<n;i++)
        {

            System.out.println(name[i]+"\t"+m[i]+"\t"+c[i]+"\t"+grade[i]);
        }
        System.out.println("the sgpa of the marksheet is: "+(sumg/sumc));
        s.close();
    }
}
