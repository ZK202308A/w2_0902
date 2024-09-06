package org.zerock.w2.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Log4j2
@Controller
public class Error403Controller {

    @GetMapping("/error403")
    public void error403(Authentication auth) {
        log.info(auth);
        log.error("403.................");
    }
}
