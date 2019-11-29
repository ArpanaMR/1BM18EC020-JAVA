import java.util.*;

class QMain
{
public static void main(String args[])
{ 
 Scanner s=new Scanner(System.in);
 System.out.println("ax^2+bx+c.Enter a,b and c values");
 int a,b,c,d;
 a=s.nextInt();
 b=s.nextInt();
 c=s.nextInt();
 d=(b*b)-(4*a*c);
 if(d==0)
 {
  double r=-b/(2*a);
  System.out.println("Roots are equalRoot is "+ r);
  }
  
  else if(d>0)
  {
   double r1=-b+(Math.sqrt(d))/(2*a);
   double r2=+b+(Math.sqrt(d))/(2*a);
   System.out.println("Roots are real and distinct. Roots are" +r1 +"and" + r2);
   }
   
   else
     System.out.println("Roots are imaginary");
	}
	}
	
   
 
