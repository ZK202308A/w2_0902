package org.zerock.w2.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.w2.dto.MemberDTO;
import org.zerock.w2.vo.MemberVO;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration({
        "file:src/main/webapp/WEB-INF/spring/root-context.xml",
        "file:src/main/webapp/WEB-INF/spring/security-config.xml"
})
@Log4j2
public class MemberMapperTests {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired(required=false)
    private MemberMapper memberMapper;

    @Test
    public void test1() {
        String pw = "1111";
        for (int i = 1; i <= 100; i++) {

            String encodedPw = passwordEncoder.encode(pw);
            String mid = "user"+i;
            String mname = "USER"+i;

            List<String> roles = new ArrayList<>();
            roles.add("USER");

            if(i >= 60){
                roles.add("MANAGER");
            }
            if( i >= 80){
                roles.add("ADMIN");
            }

            MemberVO memberVO = new MemberVO();
            memberVO.setMid(mid);
            memberVO.setMpw(encodedPw);
            memberVO.setMname(mname);

            memberMapper.insert(memberVO);

            roles.forEach(role -> {
                memberMapper.insertRole(mid,role);
            });


        }//end for
    }

    @Test
    public void testGetMember() {
        String mid ="user90";

        MemberDTO memberDTO = memberMapper.getMember(mid);

        log.info(memberDTO);

    }


}
