package rs.gaiastudio.web;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import rs.gaiastudio.model.Candle;
import rs.gaiastudio.model.Cart;
import rs.gaiastudio.model.CartItem;
import rs.gaiastudio.model.Customer;
import rs.gaiastudio.model.Order;
import rs.gaiastudio.repo.CandleRepository;


@Controller
public class WebController {
	
	@Autowired
	CandleRepository products;
	
	List<Candle> candles;
	Cart cart;
	
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
		model.addAttribute("item", new CartItem(candle));
		return "product";
	}
	
	
	@GetMapping("/cart")
	public String getCart(Model model, HttpSession session) {
		
		if(session.getAttribute("cart") != null) {
			model.addAttribute("cart", cart);
			return "basket";
		}else {
			return "basketEmpty";
		}
	}
	
	
	@PostMapping("/cart/add-item/{id}")
	public String addToCart(@ModelAttribute CartItem item, Model model, @PathVariable long id, HttpSession session) {
		
		candles = new ArrayList<Candle>();
		candles = products.findAll();
		Candle candle =  candles.get((int) id);
		CartItem candleItem = new CartItem(candle);
		candleItem.setQuantity(item.getQuantity());
		if(session.getAttribute("cart") == null) {
			cart = new Cart();
			cart.addItem(candleItem);
			session.setAttribute("cart", cart);
		}else {
			cart = (Cart) session.getAttribute("cart");
			cart.addItem(candleItem);
			session.setAttribute("cart", cart);
		}
		
		return "redirect:/cart";
	}
	
	@DeleteMapping("/cart/remove-item/{id}")
	public String removeFromCart(Model model, @PathVariable long id, HttpSession session) {
		
		candles = new ArrayList<Candle>();
		candles = products.findAll();
		Candle candle = candles.get((int) id);
		CartItem candleItem = new CartItem(candle);
		if(session.getAttribute("cart") != null) {
			cart = (Cart) session.getAttribute("cart");
			cart.removeItem(candleItem);
			session.setAttribute("cart", cart);
		}
		
		
		return "redirect:/cart";
	}
	
	@PostMapping("/cart/checkout")
	public String cartCheckout(Model model, HttpSession session) {
		//TODO
		return "checkout";
	}
	
	
	//admin login page
	@GetMapping("/admin-login")
	public String adminLogin() {
		
		return "adminLogin";
	}
	
	@GetMapping("/admin")
	public String adminPage() {
		//TODO
		return "adminPage";
	}
	
	/*	TODO:
	 *  /admin/add
	 *  /admin/remove
	 *  /admin/edit
	 *  send mail for new order
	 */
	
	
}
