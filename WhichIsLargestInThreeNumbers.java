package RavishankarGJava;

public class WhichIsLargestInThreeNumbers
{
	public static void main(String args[])
	{
		int a,b,c,lar;
		a = 12;
		b = 15;
		c = 17;
		
		lar = (a>b && a>c)?a:(b>a && b>c)?b:c;
		System.out.println("The largest of "+a+" , "+b+" and "+c+" is "+lar);
	}

}
