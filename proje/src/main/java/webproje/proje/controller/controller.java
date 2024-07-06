package webproje.proje.controller;
import jakarta.validation.Valid; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import webproje.proje.model.FormData;


@Controller
public class controller implements WebMvcConfigurer{


	 @Autowired
	    MessageSource messageSource;

	@GetMapping("/")
	public ModelAndView modelAndViewTest() {
		ModelAndView mv = new ModelAndView("survey"); 
		mv.addObject("formData",new FormData());
		return mv;
	}
	@PostMapping("/send")
	public ModelAndView processForm(@Valid @ModelAttribute FormData formData,BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("formData", formData);
		

		
		if (result.hasErrors())
			mv.setViewName("survey");
		else
			mv.setViewName("result");

		return mv;
	
	}

		
}