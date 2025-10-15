
public enum Coffee {
	ESPRESSO(120), LATTE(130), MOCHA(150);
	private double price;
	
	//constructor for enum
	Coffee(double price){
		this.price=price;
	}
	
	public double getPrice() {
		return this.price;
	}

	// Calculate final price based on selected size
    public double getTotalPrice(CoffeeSize size) {
        return price * size.getMultiplier();
    }
}
