package model.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {}

	public Order(Date moment) {
		this.moment = moment;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double sum = 0;
		for (OrderItem o : items) {
			sum += o.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf1.format(moment) + "\n");
		sb.append("Ordered Items: " + "\n");
		for (OrderItem o : items) {
			sb.append(o.getPizza().getFlavor() + ", " + o.getQuantity() + ", $ " + String.format("%.2f", o.getPrice()) + ", SubTotal: $ " + String.format("%.2f", o.subTotal()) + "\n");
		}
		sb.append("Order total: $ " + String.format("%.2f", total()));
		return sb.toString();
	}
}
