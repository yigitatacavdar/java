package productProject;
import java.util.Scanner;


public class productInfo{
	
	public void script() {
		product Product = new product();
		Product.name = "laptop";
		Product.id = 14435;
		Product.description = "thinkpad laptop";
		Product.price = 1000;
		Product.stockAmount = 4;
		Product.color = "black";
		
		product2 Product2 = new product2();
		Product2.name = "stereo";
		Product2.id = 26674;
		Product2.description = "sony stereo set";
		Product2.price = 350;
		Product2.stockAmount = 2;
		Product2.color = "silver";
		
		productManager ProductManager = new productManager();
		
		while(true){
		System.out.println("what would you like to do?");
		System.out.println("1 - Product ID check");
		System.out.println("2 - Stock check");
		Scanner obj = new Scanner(System.in);
		int input = obj.nextInt();
		
		if(input == 1) {
			ProductManager.idCheck(Product, Product2);
		}
		else if(input == 2) {
			ProductManager.stockCheck(Product, Product2);
		}
		else{
			System.out.println("enter correct number");
			System.out.println("---------------------");

			
		}
			
		}
	}
}