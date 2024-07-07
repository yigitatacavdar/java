package javaweb;

public class arrays{
	
	public static void main(String[] args) {
		String person1 = "Jack";
		String person2 = "Nathan";
		String person3 = "John";
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		
		System.out.println("----end of normal print----");
		
		String[] people = new String[3];
		people[0] = "jack";
		people[1] = "nathan";
		people[2] = "john";
		
		for(int i = 0; i < 3; i++) {
			System.out.println(people[i]);
		}
		
		System.out.println("----end of string print with loop----");
		
		for(String person:people) {
			System.out.println(person);
		}
		
		System.out.println("----end of string print with other loop----");
	}
}