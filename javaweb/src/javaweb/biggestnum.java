package javaweb;

public class biggestnum{
	
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		int num3 = 15;
		int biggest = num1;
		
		if(biggest < num2) {
			biggest = num2;
		}
		if(biggest < num3) {
			biggest = num3;
		}
		
		System.out.println("biggest number is: " +biggest);
	}
}