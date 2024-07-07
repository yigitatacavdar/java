package javaweb;

public class arrays2{
	
	public static void main(String[] args) {
		
		int[] mylist = {1, 3, 5, 6};
		int total = 0;
		int max = mylist[0];
		
		for(int number:mylist) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		
		System.out.println("sum = " +total);
		System.out.println("max = " +max);
	}
}