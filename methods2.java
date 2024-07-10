package javaweb;

public class methods2{
	
	public static void main(String[] args) {
		String message = "billions must die";
		System.out.println(message);
		String newMessage = citydata();
		System.out.println(newMessage);
		int number = merge(15,7);
		System.out.println(number);
		int sum = merge2(2,3,4);
		System.out.println(sum);
	}
	
	public static void add() {
		System.out.println("added");
	}
	
	public static void delete() {
		System.out.println("deleted");
	}
	
	public static void update() {
		System.out.println("updated");
	}
	
	public static int merge(int number1, int number2) {
		return number1 + number2;
	}
	
	public static int merge2(int... numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum += number;
		}
		return sum;
	}
	
	public static String citydata() {
		return "ankara";
	}
}