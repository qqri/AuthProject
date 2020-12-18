package com.krkimb.authproject2.profile.endpoint;

import com.krkimb.authproject2.security.auth.JwtAuthenticationToken;
import com.krkimb.authproject2.security.model.UserContext;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfileEndpoint {
    @GetMapping("/api/me")
    public @ResponseBody UserContext get(JwtAuthenticationToken token) {
        return (UserContext) token.getPrincipal();
    }
}
