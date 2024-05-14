package prj321x.assignment2.backend.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prj321x.assignment2.backend.dtos.users.RecruiterDto;
import prj321x.assignment2.backend.mappers.RecruiterMapper;
import prj321x.assignment2.backend.repositories.UserRepository;

@RestController
@RequestMapping("api/v1/recruiter")
@CrossOrigin
@Getter
@Setter
@AllArgsConstructor
public class RecruiterController {
    
    private final UserRepository userRepository;
    private final RecruiterMapper recruiterMapper;
    
    @GetMapping()
    public RecruiterDto getUser(Authentication authentication) {
        return userRepository.findByEmail(authentication.getName()).map(recruiterMapper::toDto)
                .orElseThrow();
    }
}
