package javaweb;

public class switchcase{
	
	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
			case 'A':
				System.out.println("excellent");
				break;
			case 'B':
				System.out.println("good");
				break;
			default:
				System.out.println("unknown grade");
		}
	}
}