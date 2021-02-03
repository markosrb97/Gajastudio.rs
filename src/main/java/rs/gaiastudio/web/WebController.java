package rs.gaiastudio.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import rs.gaiastudio.model.Customer;
import rs.gaiastudio.model.Order;
import rs.gaiastudio.repo.CandleRepository;

@Controller
public class WebController {
	
	CandleRepository candleRepository;
	
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
		
		return "shop";
	}
}
