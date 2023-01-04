package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TitleController {
	@GetMapping("/title")
	public String getTitle() {
		return "title";
	}
}
