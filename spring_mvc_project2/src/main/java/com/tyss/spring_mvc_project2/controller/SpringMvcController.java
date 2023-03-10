package com.tyss.spring_mvc_project2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.tyss.spring_mvc_project2.entity.EmployeePrimaryInfo;
import com.tyss.spring_mvc_project2.service.EmpService;

@Controller
public class SpringMvcController {
	@Autowired
	private EmpService service;

	@GetMapping("/register")
	public String getRegistrationForm() {
		return "RegistrationForm";
	}

	@GetMapping("/login")
	public String getLogin() {
		return "login";

	}

	@PostMapping("/register")
	public String getRegisterButton(EmployeePrimaryInfo employeePrimaryInfo, ModelMap map) {

		if (service.register(employeePrimaryInfo)) {
			map.addAttribute("msg", "Registarion SucessFull");
		} else
			map.addAttribute("errmsg", "Something Went Wrong");

		return "RegistrationForm";

	}

	@PostMapping("/login")
	public String authenticate(EmployeePrimaryInfo employeePrimaryInfo, ModelMap map, HttpServletRequest request) {
		if (employeePrimaryInfo != null && (!employeePrimaryInfo.getEmpId().isEmpty())) {
			EmployeePrimaryInfo employee2 = service.authenticate(employeePrimaryInfo);
			if (employee2 != null) {
				HttpSession session = request.getSession();
				session.setAttribute("loggedIn", employee2);
				map.addAttribute("name", employee2.getEmpName());
				return "welcome";
			} else {
				map.addAttribute("errMsg", "Invalid credentials");
			}
		} else {
			map.addAttribute("errMsg", "Please enter something!");
		}
		return "login";
	}

	public String getDeleteform(
			@SessionAttribute(name = "loggedIn", required = false) EmployeePrimaryInfo employeePrimaryInfo,
			ModelMap map) {
		if (employeePrimaryInfo != null) {
			map.addAttribute("empId", employeePrimaryInfo.getEmpId());
			return "deleteForm";

		}
		return null;

	}
}