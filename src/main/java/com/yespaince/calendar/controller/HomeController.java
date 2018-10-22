package com.yespaince.calendar.controller;

import java.util.ArrayList;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yespaince.calendar.cal.Calendar01;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		Calendar c=Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH); //현재 월을 가져온다. (1월은 0) 
		int day=c.get(Calendar.DATE);
		
		Calendar01 cal=new Calendar01();
		ArrayList<Integer> arr=cal.getCal(year, month, day);

		model.addAttribute("arr", arr);
		model.addAttribute("year", year);
		model.addAttribute("month", month+1);
		model.addAttribute("day", day);
		
		return "home";
	}
	
}
