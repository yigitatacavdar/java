package productProject;
import java.util.Scanner;

public class productManager{
	
	
	public void idCheck(product Product, product2 Product2) {
		
		 Scanner id = new Scanner(System.in);
		 System.out.println("please enter id of your product:");
		 int idInput = id.nextInt();
		 
		if(idInput == Product.id) {
			System.out.println("Product -> " + Product.name);
			Scanner id1 = new Scanner(System.in);
			 System.out.println("do you want description? 1- Yes or 2- No");
			 int id1Input = id1.nextInt();
			 if(id1Input == 1) {
				 System.out.println(Product.description);
			 }
			 else {
				 
			 }
			
			System.out.println("---------------------");

		}
		
		else if(idInput == Product2.id) {
			 System.out.println("Product -> " + Product2.name);
			 Scanner id1 = new Scanner(System.in);
			 System.out.println("do you want description? 1- Yes or 2- No");
			 int id1Input = id1.nextInt();
			 if(id1Input == 1) {
				 System.out.println(Product2.description);
			 }
			 else {
				 
			 }
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