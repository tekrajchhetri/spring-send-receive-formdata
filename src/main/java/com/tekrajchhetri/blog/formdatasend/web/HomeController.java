package com.tekrajchhetri.blog.formdatasend.web;

import com.tekrajchhetri.blog.formdatasend.UserInfo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("userInfo", new UserInfo());
        return "index";
    }
}
