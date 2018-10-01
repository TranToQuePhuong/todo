package com.green.todomana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.green.todomana.entity.todoM;
import com.green.todomana.service.todoMService;

@Controller
@RequestMapping("/todoM")
public class todoMController {
		@Autowired
		private todoMService todoMService;

		@RequestMapping(method = RequestMethod.GET)
		public String list(Model model) {
			List<todoM> todo = todoMService.findAll();
			model.addAttribute("todo", todo);
			return "home";
		}
	}
