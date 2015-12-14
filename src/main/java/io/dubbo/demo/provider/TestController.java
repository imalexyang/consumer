package io.dubbo.demo.provider;

import io.dubbo.demo.provider.service.ProviderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private ProviderService providerService;
	
	@RequestMapping("/hello")
	public String hello(Model model,String name){		
		model.addAttribute("hello", providerService.hello(name));
		return "/hello";
	}
}
