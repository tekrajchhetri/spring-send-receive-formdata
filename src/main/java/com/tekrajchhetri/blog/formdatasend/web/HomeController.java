package com.tekrajchhetri.blog.formdatasend.web;

import com.tekrajchhetri.blog.formdatasend.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("userInfo", new UserInfo());
        return "index";
    }

    @RequestMapping(value = "/userdata",method = RequestMethod.POST)
    public String processForm(UserInfo user){
        return "show-form-data";
    }
}
