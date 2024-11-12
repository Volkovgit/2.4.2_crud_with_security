package org.example.security.handler;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler {
    private static String URL_BEGIN = "/2_4_2_crud_with_security_war_exploded";
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException {
        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        if (roles.contains("ROLE_ADMIN")) {
            httpServletResponse.sendRedirect(URL_BEGIN+"/admin");
        } else if(roles.contains("ROLE_USER")){
            httpServletResponse.sendRedirect(URL_BEGIN+"/user");
        } else {
            httpServletResponse.sendRedirect(URL_BEGIN+"/logout");
        }
    }
}
