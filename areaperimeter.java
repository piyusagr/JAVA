// Area Of Circle Java Program     a=3.14*r^2
//    Area Of Triangle             aot=0.5*b*h
// Area Of Rectangle Program       aor=l*b
// Area Of Isosceles Triangle      aoit=aot
// Area Of Parallelogram           aop=b*h
//Area Of Rhombus                   aor=0.5*sd*ld
// Area Of Equilateral Triangle     1/4*sqrt(3).s^2
// Perimeter Of Circle              poc=2*3.24*r
// Perimeter Of Equilateral Triangle  3*l
//Perimeter Of Parallelogram          2(l+b)
// Perimeter Of Rectangle            2(l+b)
//Perimeter Of Square                 4*l
// Perimeter Of Rhombus               4*l
// Curved Surface Area Of Cylinder  
//Total Surface Area Of Cube


import java.util.*;

// import javax.swing.plaf.synth.SynthSplitPaneUI;

public class areaperimeter {
    
    public  static void area(){
        Scanner s=new Scanner(System.in);
        float  r=s.nextFloat();
        float l=s.nextFloat();
        float b=s.nextFloat();
        float h=s.nextFloat();
        float sd=s.nextFloat();
        float ld=s.nextFloat();
        System.out.println("area of circle: "+3.14*Math.pow(r,2));
        System.out.println("area of triangle: "+0.5*h*b);
        System.out.println("area of rectangle: "+l*b);
        System.out.println("area of isoscles triangle: "+0.5*b*h);
        System.out.println("area of parallelogram: "+b*h);
        System.out.println("area of rhombus: "+0.5*sd*ld);
        System.out.println("area of equilateral triangle: "+(1/4)*Math.sqrt(3)*Math.pow(b,2));
        System.out.println("curved surface area of cylinder: "+2*3.14*r*h);
        System.out.println("total surface area of cube: "+6*Math.pow(l,2));
        s.close();
    }
    

    public static void perimeter(){
        Scanner a=new Scanner(System.in);
        float  r=a.nextFloat();
        float l=a.nextFloat();
        float b=a.nextFloat();
        System.out.println("perimeter of circle: "+2*3.14*r);
        System.out.println("perimeter of equilateral triangle: "+3*l);
        System.out.println("perimeter of parallelogram: "+2*(l+b));
        System.out.println("perimeter of rectangle: "+2*(l+b));
        System.out.println("perimeter of square: "+4*l);
        System.out.println("perimeter of rhombus: "+4*l);
        a.close();
    }
    public static void main(String ads[]){
        
        area();
        perimeter();
    }
}
