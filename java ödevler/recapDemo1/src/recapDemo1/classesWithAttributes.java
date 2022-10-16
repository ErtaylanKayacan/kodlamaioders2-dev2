package recapDemo1;

public class classesWithAttributes {

	public static void main(String[] args) {
		Product product = new Product();
		product.set_name("laptop");
		product.set_description("Asus Laptop;");
		product.set_id(4);
		product.set_price(2400);
		product.set_stockAmount(3);
		
		ProductManager productManager  = new ProductManager();
		 productManager.Add(product);
	}

}
