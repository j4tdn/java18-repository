package bkit.java18.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static common.ViewNameConstants.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping({ "/", "" })
	public String index() {
		return VN_EMPLOYEE_PAGE_INDEX;
	}

}
