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
	@Column(name = "description", columnDefinition = "CLOB")
	@Lob
	private String description;
	
	public Candle(String type, int price, String description) {
		this.type = type;
		this.price = price;
		this.description = description;
	}
	
	public Candle(String type, int price) {
		this.type = type;
		this.price = price;
	}
	
	public Candle() {
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getType() {
		return type;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public long getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return type + "\n" + price + "\n" + this.description + "\n";
	}
}