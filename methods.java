package javaweb;

public class methods{
	
	public static void printNum(int x,int y, String word1, String word2, int z) {
		System.out.println(x + y + word1 + z);
		System.out.printf("%d %d %d", x, y, z);
	}
	
	public static void hello() {
		System.out.println("helloworld");
		int x = 10;
		int y = 20;
		String word1 = "plumb";
		String word2 = "trial";
		
		int z = x + y;
		
		printNum(x,y,word1,word2,z);
	}
	
	public static void main(String[] args) {
		hello();
		
	}
}