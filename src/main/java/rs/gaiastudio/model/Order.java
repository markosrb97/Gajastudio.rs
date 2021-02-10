package rs.gaiastudio.model;

import java.util.LinkedList;
import java.util.List;

public class Order {
	private Customer customer;
	private List<Candle> candles;
	
	public Order(Customer customer) {
		this.customer = customer;
		candles = new LinkedList<Candle>();
	}
	
	public Order(Customer customer, Candle candle) {
		this.customer = customer;
		candles = new LinkedList<Candle>();
		candles.add(candle);
	}
	
	public void addCandle(Candle candle) {
		candles.add(candle);
	}
	
	public String toString() {
		String candleInfo = "";
		for(int i = 0; i < candles.size(); i++) {
			candleInfo += candles.get(i).toString();
		}
		return customer.toString() + "\n" + candleInfo;
	}
	
}