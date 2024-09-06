package org.zerock.w2.security;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.zerock.w2.dto.MemberDTO;
import org.zerock.w2.mapper.MemberMapper;
import org.zerock.w2.mapper.TimeMapper;

@Log4j2
@Service(value = "customDetails")
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final TimeMapper timeMapper;
    private final MemberMapper memberMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        log.info("---------------------------------");
        log.info("---------------------------------");
        log.info("loadUserByUsername: " + username);
        log.info(timeMapper.getTime());

        MemberDTO memberDTO = memberMapper.getMember(username);

        log.info(memberDTO);

        log.info("---------------------------------");
        log.info("---------------------------------");

        return memberDTO;
    }
}
