package model.entities;

public class Pizza {
	
	private String flavor;
	private Double unitPrice;
	
	public Pizza() {}

	public Pizza(String flavor, Double unitPrice) {
		this.flavor = flavor;
		this.unitPrice = unitPrice;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	@Override
	public String toString() {
		return "Flavor: " 
				+ flavor
				+ ", Unit price: "
				+ unitPrice;
	}
	
}
