package com.green.todomana.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;


import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
			model.addAttribute("todoM", todo); //Ä‘á»• dá»¯ liá»‡u database dÃ´ Model cá»§a Page
			return "todoHome"; //gá»�i xuá»‘ng file jsp "todoHome" Ä‘á»ƒ hiá»ƒn thá»‹ theo giao diá»‡n Ä‘Ã£ setup
		}
}	
	  