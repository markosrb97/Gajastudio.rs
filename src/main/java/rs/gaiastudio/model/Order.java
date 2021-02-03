package rs.gaiastudio.model;

import java.util.LinkedList;
import java.util.List;

public class Order {
	private Customer customer;
	private List<Candle> candles;
	
	public Order(Customer customer) {
		this.customer = customer;
	}
	
	public Order(Customer customer, Candle candle) {
		this.customer = customer;
		candles = new LinkedList<Candle>();
		candles.add(candle);
	}
	
	public String getCustomerInfo() {
		return this.customer.toString();
	}
	
	
}
