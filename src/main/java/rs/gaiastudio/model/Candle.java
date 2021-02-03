package rs.gaiastudio.model;


import javax.persistence.*;


@Entity
@Table(name = "candles")
public class Candle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "type")
	private String type;
	@Column(name = "price")
	private int price;

	
	public Candle(String type, int price) {
		this.type = type;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getType() {
		return type;
	}
	
	
	@Override
	public String toString() {
		return type + "\n" + price + "\n";
	}
}