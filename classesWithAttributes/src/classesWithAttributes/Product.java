package classesWithAttributes;

public class Product {

	public Product(int id, String name, String descripString, double price, double stockAmount) {
		this.description=descripString;
		this.id=id;
		this.kod=kod;
		this.name= name;
		this.price=price;
		this.stockAmount= stockAmount;
	}

	public Product() {
	}

	private int id;
	private String name;
	private String description;
	private double price;
	private double stockAmount;
	private String kod;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(double stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getKod() {
		return this.kod.substring(0, 1) + id;

	}

}
