package productProject;
import java.util.Scanner;

public class productManager{
	
	
	public void idCheck(product Product, product2 Product2) {
		
		 Scanner id = new Scanner(System.in);
		 System.out.println("please enter id of your product:");
		 int idInput = id.nextInt();
		 
		if(idInput == Product.id) {
			System.out.println("Product -> " + Product.name);
			System.out.println("---------------------");

		}
		
		else if(idInput == Product2.id) {
			System.out.println("Product -> " + Product2.name);
			System.out.println("---------------------");

			
		}
		else {
			System.out.println("id doesnt match any products");
			System.out.println("---------------------");

		}
		
	}
	
	public void stockCheck(product Product, product2 Product2) {
		
		 Scanner id = new Scanner(System.in);
		 System.out.println("please enter id of your product:");
		 int idInput = id.nextInt();
		 
		if(idInput == Product.id) {
			System.out.println("Product Stock Amount-> " + Product.stockAmount);
			System.out.println("---------------------");

		}
		
		else if(idInput == Product2.id) {
			System.out.println("Product Stock Amount-> " + Product2.stockAmount);
			System.out.println("---------------------");

			
		}
		else {
			System.out.println("id doesnt match any products");
			System.out.println("---------------------");

		}
		
	}
	
}