package bkit.java18.controller;

import static common.ViewNameConstants.VN_STUDENT_PAGE_INDEX;
import static common.ViewNameConstants.VN_STUDENT_PAGE_REGISTER;
import static common.ViewNameConstants.VN_STUDENT_PAGE_SUCCESS;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bkit.java18.bean.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, editor);
	}

	@GetMapping({ "/", "" })
	public String index() {
		return VN_STUDENT_PAGE_INDEX;
	}

	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("student", new Student());
		return VN_STUDENT_PAGE_REGISTER;
	}

	@PostMapping("/register")
	public String submitRegForm(Model model, @Valid @ModelAttribute("student") Student student,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return VN_STUDENT_PAGE_REGISTER;
		}

		model.addAttribute("student", student);
		return VN_STUDENT_PAGE_SUCCESS;
	}

}
