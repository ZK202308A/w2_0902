package org.zerock.w2.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class CustomLoginController {

    @GetMapping("/customLogin")
    public void login(String error, Model model) {
        log.info("login");

        if(error != null) {
            model.addAttribute("errorMsg", "Login failed");
        }
    }

}
