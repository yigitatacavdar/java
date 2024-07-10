package javaweb;

public class strings{
	public static void main(String[] args) {
		
		String message = "helloworld";
		System.out.println(message);
		
		System.out.println("message lenght: " +message.length());
		System.out.println("4. letter: " +message.charAt(3));
		System.out.println(message.concat(" welcome"));
		System.out.println(message.startsWith("h"));
		System.out.println(message.startsWith("r"));
		char[] characters = new char[5];
		message.getChars(0, 5, characters, 0);
		System.out.println(characters);
		System.out.println(message.indexOf("or"));
		System.out.println(message.lastIndexOf("l"));
		
	}
}