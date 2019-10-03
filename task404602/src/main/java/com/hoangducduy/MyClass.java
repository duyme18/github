package com.hoangducduy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyClass {
	@GetMapping("/")
	public String indexForm() {
		return "index";
	}

	@PostMapping("/converter")
	public String convert(@RequestParam double usd, double rate, Model model) {
		double vnd = usd * rate;
		model.addAttribute("rate", rate);
		model.addAttribute("usd", usd);
		model.addAttribute("vnd", vnd);
		return "index";
	}
}
