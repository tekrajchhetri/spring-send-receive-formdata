package com.tekrajchhetri.blog.formdatasend.web;

import com.tekrajchhetri.blog.formdatasend.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("formdata", new User());
        return "index";
    }

    @RequestMapping(value = "/userdata",method = RequestMethod.POST)
    public String processForm(User user){
        return "userinfo";
    }
}
