package javaweb;

public class arrays3{
	
	public static void main(String[] args) {
		
		String[][] cities = new String[3][3];
		
		cities[0][0] = "istanbul";
		cities[0][1] = "bursa";
		cities[0][2] = "ankara";
		cities[1][0] = "muğla";
		cities[1][1] = "konya";
		cities[1][2] = "afyon";
		cities[2][0] = "kars";
		cities[2][1] = "çorum";
		cities[2][2] = "yozgat";
		
		for(int i = 0; i <= 2; i++) {
			
			System.out.println("----------");
			
			for(int j = 0; j <= 2; j++) {
				System.out.println(cities[i][j]);
			}
		}
	}
}