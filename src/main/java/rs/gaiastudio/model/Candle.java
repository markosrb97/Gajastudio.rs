package rs.gaiastudio.model;

public class Candle {
	
	private CandleType type;
	private int price;
	private int numberOfCandles;
	
	public Candle(CandleType type, int price) {
		this.type = type;
		this.price = price;
	}
	
	public int getPrice() {
		return price * numberOfCandles;
	}
	
	public CandleType getType() {
		return type;
	}
	
	public void setPNumberOfCandles(int numberOfCandles) {
		this.numberOfCandles = numberOfCandles;
	}
	
	@Override
	public String toString() {
		return type + "\n" + price + "\n";
	}
}