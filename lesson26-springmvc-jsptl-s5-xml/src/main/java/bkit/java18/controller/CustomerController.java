package bkit.java18.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static common.ViewNameConstants.*;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@GetMapping({ "/", "" })
	public String index() {
		return VN_CUSTOMER_PAGE_INDEX;
	}

}
