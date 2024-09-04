package org.zerock.w2.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

@Controller
@RequestMapping("/upload")
@Log4j2
public class UploadController {

    @PostMapping("")
    public void upload(MultipartFile[] files) {

        log.info("------------------------");
        log.info(Arrays.toString(files));
    }

}
