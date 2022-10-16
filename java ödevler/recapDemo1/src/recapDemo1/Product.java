package recapDemo1;

public class Product {
	public Product() {
		System.out.println("Yapıcı blok çalıştı!!!");
	}
	private String _name;
	private double _price;
	private int _id;
	private int _stockAmount;
	private String _renk;
	private String _kod;
	private String _description;

	public String get_name() {
		return _name;
	}

	public String get_description() {
		return _description;
	}

	public double get_price() {
		return _price;
	}

	public int get_id() {
		return _id;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public String get_renk() {
		return _renk;
	}

	public String get_kod() {
	 return this._name.substring(0,1) + _kod;
	}

	public void set_name(String name) {
		this._name = name;
	}

	public void set_description(String description) {
		this._description = description;
	}

	public void set_price(double price) {
		this._price = price;
	}

	public void set_id(int id) {
		this._id = id;
	}

	public void set_stockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

	public void set_renk(String renk) {
		this._renk = renk;
	}

	

}
