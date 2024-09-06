package org.zerock.w2.security.handler;

import lombok.extern.log4j.Log4j2;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Log4j2
public class CustomAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {

        log.error("=================================");
        log.error("----------------------------------");
        log.error(accessDeniedException);
        log.error(accessDeniedException.getMessage());


        response.sendError(
                HttpServletResponse.SC_FORBIDDEN,
                accessDeniedException.getMessage());

    }
}
