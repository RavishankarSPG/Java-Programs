package RavishankarGJava;

public class WhichIsLargestInFiveNumbers
{
	public static void main (String[] args)
	{
		int a,b,c,d,e,largest;
		a=50;b=30;c=65;d=95;e=70;
		largest = (a>b && a>c && a>d && a>e)?a:(a<b && b>c && b>d && b>e)?b:(c>a && c>b && c>d &&c>e)?c:(d>a && d>b && d>c && d>e)?d:e; 
		System.out.println("The largest of five numbers is "+largest);

	}
}
