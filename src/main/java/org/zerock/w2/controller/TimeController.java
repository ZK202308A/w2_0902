package org.zerock.w2.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class TimeController {

    @GetMapping("/time")
    public void time() {
        log.info("time");
    }

}
