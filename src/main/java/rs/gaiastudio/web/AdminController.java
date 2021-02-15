package rs.gaiastudio.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
	
	/*	TODO:
	 *  /admin/add
	 *  /admin/remove
	 *  /admin/edit
	 */
	
}
