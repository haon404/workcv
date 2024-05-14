package prj321x.assignment2.backend.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prj321x.assignment2.backend.services.TokenService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/login")
@CrossOrigin
@Getter
@Setter
@AllArgsConstructor
public class LoginController {
    
    private final TokenService tokenService;
    
    @PostMapping
    public Map<String, String> provideLoginToken(Authentication authentication) {
        Map<String, String> response = new HashMap<>();
        response.put("token", tokenService.generateToken(authentication));
        response.put("role", authentication.getAuthorities().stream().toList().get(0).toString());
        return response;
    }
}
