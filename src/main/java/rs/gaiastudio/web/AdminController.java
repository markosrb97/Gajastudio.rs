package rs.gaiastudio.web;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import rs.gaiastudio.model.Candle;
import rs.gaiastudio.repo.CandleRepository;


@Controller
public class AdminController {
	
	@Autowired
	CandleRepository products;
	
	@GetMapping("/admin-login")
	public String adminLogin() {
		
		return "adminLogin";
	}
	
	@GetMapping("/admin")
	public String adminPage(Model model) {
		
		ArrayList<Candle> candles = (ArrayList<Candle>) products.findAll();
		model.addAttribute("candles", candles);
		return "adminPage";
	}
	
	@GetMapping("/admin/add")
	public String addItem(Model model) {
		
		return "add";
	}
	
	@PostMapping("/admin/add")
	public String addItem(@ModelAttribute Candle candle) {
		
		System.out.println("adding " + candle.toString());
		products.save(candle);
		
		return "redirect:/admin";
	}
	
	
	@GetMapping("/admin/edit/{id}")
	public String editItem(Model model, @PathVariable int id) {
		
		Optional<Candle> item = products.findById((long) id);
		Candle candle = item.get();
		model.addAttribute("candle", candle);
		
		return "edit";
	}
	
	@PostMapping("/admin/edit/{id}")
	public String editItem(Model model, @PathVariable int id, @ModelAttribute Candle candle) {
		
		//TODO
		
		return "edit";
	}
	
	/*	TODO:
	 *  /admin/add
	 *  /admin/remove
	 *  /admin/edit
	 */
	
}
