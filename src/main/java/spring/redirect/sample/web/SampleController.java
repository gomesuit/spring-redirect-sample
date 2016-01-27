package spring.redirect.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController {
	@RequestMapping("/")
	private String top(Model model) {
		model.addAttribute("number", 1);
		return "sample";
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String handle(RedirectAttributes redirectAttrs) {
		redirectAttrs.addAttribute("id", 10).addFlashAttribute("message", "Account created!");
		return "redirect:/";
	}
}
