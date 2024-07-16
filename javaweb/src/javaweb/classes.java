package javaweb;

public class classes{
	
	public static void main(String[] args){
		customerManager CustomerManager = new customerManager();
		CustomerManager.Add();
		CustomerManager.Remove();
		CustomerManager.Update();
		
		
		int number1 = 10;
		int number2 = 20;
		number2 = number1;
		number1 = 30;
		System.out.printf("%d\n%d\n", number1, number2);
		
		
		int[] numbers1 = new int[] {1,2,3,};
		int[] numbers2 = new int[] {4,5,6,};
		
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
	}
}
