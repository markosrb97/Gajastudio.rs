package rs.gaiastudio.model;

import java.util.ArrayList;

public class Cart extends ArrayList<CartItem>{

	private static final long serialVersionUID = 1L;
	
	private int sumPrice;
	
	public int getSumPrice() {
		sumPrice = 0;
		for(int i = 0; i < this.size(); i++) {
			sumPrice += this.get(i).getCandle().getPrice();
		}
		return sumPrice;
	}
	
	public void addItem(CartItem item) {
		if(this.containsCandle(item.getCandle().getType())) {
			int i = this.get(this.indexOfCandle(item.getCandle().getType())).getQuantity();
			i++;
			this.get(this.indexOfCandle(item.getCandle().getType())).setQuantity(i);
		}else {
			this.add(item);
		}
	}
	
	
	public void removeItem(CartItem item) {
		if(this.contains(item)) {
			this.get(this.indexOf(item)).setQuantity(0);
			this.remove(item);
		}
	}
	
	// returns true if candle of passed type is found, otherwise returns false
	public boolean containsCandle(String candleType) {
		for(int i = 0; i < this.size(); i++) {
			if(this.get(i).getCandle().getType() == candleType) {
				return true;
			}
		}
		return false;
	}
	
	// returns index of first occurrence of passed candle type
	// -1 if not found
	public int indexOfCandle(String candleType) {
		for(int i = 0; i < this.size(); i++) {
			if(this.get(i).getCandle().getType() == candleType) {
				return i;
			}
		}
		return -1;
	}
	

}
