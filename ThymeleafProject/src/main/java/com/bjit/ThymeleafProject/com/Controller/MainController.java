package com.bjit.ThymeleafProject.com.Controller;

import com.bjit.ThymeleafProject.Model.Citizens;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class MainController {

    //ArrayList <Citizens> citizs = new ArrayList<Citizens>();
    @GetMapping("/welcome")
    public String welcomePage(){
        return "WelcomePage.html";
    }

//    @PostMapping("/receive")
//    public String receivePage(@RequestParam String name, @RequestParam String age,
//                              @RequestParam String address, Model model){
//        model.addAttribute("name",name);
//        model.addAttribute("age",age);
//        model.addAttribute("address",address);
//        return "ViewPage.html";
//    }
@PostMapping("/receive")
public ModelAndView receivePage(@ModelAttribute Citizens citizen, ModelAndView model){
        model.setViewName("ViewPage.html");
        model.addObject("citizen",citizen);

        return model;
    }
//    @GetMapping("/allview")
//    public ModelAndView allCitizens(ModelAndView model){
//        Citizens c1 = new Citizens("")
//        return model;
//    }
}
