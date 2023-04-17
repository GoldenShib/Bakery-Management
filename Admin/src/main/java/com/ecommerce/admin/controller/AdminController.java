package com.ecommerce.admin.controller;


import com.ecommerce.library.model.Admin;
import com.ecommerce.library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = {"/index", "/"}, method = RequestMethod.GET)
    public String index(Model model, Principal principal, HttpSession session){
        if(principal != null){
            session.setAttribute("username", principal.getName());
            Admin Admin = adminService.findByUsername(principal.getName());
        }
        return "index";
    }

    @GetMapping("/charts")
    public String charts( ) {
        return "charts";
    }

    @GetMapping("/tables")
    public String tables( ) {
        return "tables";
    }

}
