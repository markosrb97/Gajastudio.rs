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
		//System.out.println("Ubacuje se u korpu: " + item.getCandle().toString());
		if(this.contains(item)) {
			int i = this.get(this.indexOf(item)).getQuantity();
			i++;
			this.get(this.indexOf(item)).setQuantity(i);
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
	

}
