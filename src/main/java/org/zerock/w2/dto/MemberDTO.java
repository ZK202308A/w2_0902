package org.zerock.w2.dto;

import lombok.Data;

import java.util.List;

@Data
public class MemberDTO {

    private String mid;
    private String mpw;
    private String mname;

    private List<String> roles;
}
