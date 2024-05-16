package prj321x.assignment2.backend.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import prj321x.assignment2.backend.dtos.users.RegisterDto;
import prj321x.assignment2.backend.mappers.RegisterMapper;
import prj321x.assignment2.backend.repositories.UserRepository;

@RestController
@RequestMapping("api/v1/register")
@CrossOrigin
@Getter
@Setter
@AllArgsConstructor
public class RegisterController {
    
    private final UserRepository userRepository;
    private final RegisterMapper registerMapper;
    private final PasswordEncoder passwordEncoder;
    
    @PostMapping
    public ResponseEntity<String> register(@RequestBody RegisterDto registerDto) {
        if (userRepository.findByEmail(registerDto.getEmail()).isPresent()) {
            return ResponseEntity.badRequest().body("Email already exist");
        }
        try {
            registerDto.setPassword(passwordEncoder.encode(registerDto.getPassword()));
            userRepository.save(registerMapper.toEntity(registerDto));
        } catch (Exception e) {
            ResponseEntity.badRequest().body("Something wrong happened");
        }
        
        return ResponseEntity.ok("Account created successfully");
    }
}
