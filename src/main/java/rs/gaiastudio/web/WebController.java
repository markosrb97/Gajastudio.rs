package rs.gaiastudio.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import rs.gaiastudio.model.Customer;

@Controller
public class WebController {
	
	@GetMapping("/order-form")
	public String getForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "orderForm";
	}
	
	@PostMapping("/order-form")
	public String submitOrder(@ModelAttribute Customer customer, Model model) {
		model.addAttribute("customer", customer);
		return "order";
	}
}
