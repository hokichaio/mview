package jp.co.netmile.crwdsrc.controller;

import jp.co.netmile.crwdsrc.service.EventDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	private EventDataService eventDataService;
	
	@RequestMapping(value = "/")
	public ModelAndView top() {
		
		ModelAndView mav = new ModelAndView("main/top");
		mav.addObject("events", eventDataService.getEvents());
		
		return mav;
	}
	
}
