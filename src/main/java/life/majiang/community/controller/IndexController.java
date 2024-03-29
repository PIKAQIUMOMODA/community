package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam(name="name",required = false,defaultValue="您好")String name, Model model)
    {
        model.addAttribute("name",name);
       return "/hello";
    }

    @RequestMapping("/")
    public String index()
    {
        return "index";
    }
}
