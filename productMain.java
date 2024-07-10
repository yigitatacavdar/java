package javaweb;

public class productMain{
	
	public static void main(String[] args) {
		product Product = new product();
		Product.name = "laptop";
		Product.id = 1;
		Product.description = "thinkpad laptop";
		Product.price = 50000.50;
		Product.stockAmount = 4;
		Product.color = "green";
		
		System.out.println(Product.price);
		
		productManager ProductManager = new productManager();
		ProductManager.Add(Product);
		
		ProductManager.Add2(1, "hey", "dfe", 2, 200);
		ProductManager.Add2(1, "hey", "dfe", 2, 200);
		ProductManager.Add2(1, "hey", "dfe", 2, 200);
		ProductManager.Add2(1, "hey", "dfe", 2, 200);
		ProductManager.Add2(1, "hey", "dfe", 2, 200);
		

	}
}