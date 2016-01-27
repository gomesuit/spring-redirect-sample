package spring.redirect.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {    
    @RequestMapping("/")
    private String top(Model model){
    	model.addAttribute("number", 1);
        return "sample";
    }
}
