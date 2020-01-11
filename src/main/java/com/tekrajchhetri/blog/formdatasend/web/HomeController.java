package com.tekrajchhetri.blog.formdatasend.web;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
