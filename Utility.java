public class Utility{
	
public static int fahrenheitToCelcius(double fahrenheit) {
	double celcius;
	celcius=(fahrenheit-32)*(5/9);
	return (int)celcius;
}
public static void getTheLevel(int[] array) {
int sum=0;
for(int x: array) {
	sum=sum+x;
	if(sum>=100) {
		System.out.println("high");
	}
	else if(sum>=70) {
		System.out.println("medium");
	}
	else
	{
		System.out.println("low");
	}
}

}
}