package cyft.nikhila.assign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cyft.nikhila.assign.Service.ItemService;

@Controller
public class IndexController {
	
	@Autowired
	private ItemService itemService;

	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("items", itemService.getItems());
		return "index";
	}
}