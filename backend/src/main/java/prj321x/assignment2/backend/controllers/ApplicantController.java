package prj321x.assignment2.backend.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prj321x.assignment2.backend.dtos.users.ApplicantDto;
import prj321x.assignment2.backend.mappers.ApplicantMapper;
import prj321x.assignment2.backend.repositories.UserRepository;

@RestController
@RequestMapping("api/v1/applicant")
@CrossOrigin
@Getter
@Setter
@AllArgsConstructor
public class ApplicantController {
    
    private final UserRepository userRepository;
    private final ApplicantMapper applicantMapper;
    
    @GetMapping()
    public ApplicantDto getUser(Authentication authentication) {
        System.out.println(authentication.getName());
        return userRepository.findByEmail(authentication.getName())
                .map(applicantMapper::toDto)
                .orElseThrow();
    }
}
