package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(500);
		product.setStockAmount(12);
		
		ProductManager productManager= new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());
		

	}

}
