import java.util.*;
class Gen<T,V>
{
	T a;
	V b;
	Gen(T ob,V ob2)
	{
		a=ob;
		b=ob2;
		System.out.println(ob+" "+ob2);
	}
	
}
class GenDemo
{
	public static void main(String args[])
	{
		Gen<Integer,String> o1=new Gen<Integer,Double>(65,35.231);
		Gen<Double,Character> o2=new Gen<String,Character>("Hello",'a');
		
	}
}
