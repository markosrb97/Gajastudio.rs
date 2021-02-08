package rs.gaiastudio.web;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import rs.gaiastudio.model.Candle;
import rs.gaiastudio.model.Customer;
import rs.gaiastudio.model.Order;
import rs.gaiastudio.repo.CandleRepository;


@Controller
public class WebController {
	
	@Autowired
	CandleRepository products;
	
	List<Candle> candles;
	List<Candle> cart;
	
	@GetMapping("/order")
	public String getForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "orderForm";
	}
	
	@PostMapping("/order")
	public String submitOrder(@ModelAttribute Customer customer, Model model) {
		Order order = new Order(customer);
		model.addAttribute("order", order);
		return "orderForm";
	}
	
	@GetMapping("/shop")
	public String getShop(Model model) {

		candles = new ArrayList<Candle>();
		candles = products.findAll();
		model.addAttribute("candles", candles);
		
		return "shop";
	}
	
	
	@GetMapping("/shop/product/{id}")
	public String getProduct(@PathVariable long id, Model model) {
		Optional<Candle> value = products.findById(id);
		Candle candle = value.get();
		model.addAttribute("candle", candle);
		return "product";
	}
	
	
	@GetMapping("/cart")
	public String getCart(Model model) {
		
		return "basket";
	}
	
	
}
