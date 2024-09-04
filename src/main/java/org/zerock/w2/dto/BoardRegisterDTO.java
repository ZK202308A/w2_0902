package org.zerock.w2.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;


@Data
@ToString
@Builder
public class BoardRegisterDTO {

    private String title;
    private String content;
    private String writer;

    private MultipartFile[] files;

}
