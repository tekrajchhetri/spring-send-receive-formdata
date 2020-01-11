package com.tekrajchhetri.blog.formdatasend.web;

import com.tekrajchhetri.blog.formdatasend.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

    @RequestMapping("/index")
    public String index(UserInfo userInfo){
        return "index";
    }
}
