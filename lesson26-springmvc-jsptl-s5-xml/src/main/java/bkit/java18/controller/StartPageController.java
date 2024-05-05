package bkit.java18.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static common.ViewNameConstants.*;

@Controller
public class StartPageController {

	@GetMapping({"/", "/welcome"})
	public String welcome() {
		return VN_STARTPAGE_INDEX;
	}
	
}
