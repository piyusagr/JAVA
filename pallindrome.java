//to find whetheer the string is pallindrome or not

import java.util.*;

public class pallindrome {
    static String reverse(String s1)
	{
	String rev="";
	for(int j=s1.length();j>0;--j)
	{
	rev=rev+(s1.charAt(j-1)); 
	}
	return rev;
	}
    public static void main(String ags[]){
        Scanner a=new Scanner(System.in);
        String s1=a.next();
        String s2=reverse(s1);
        
        
        if(s2==s1)
        {
            System.out.println(s2+" is pallindrome");
        }
        else
            System.out.println(s2+" is not pallindrome");
        a.close();
    }
}
