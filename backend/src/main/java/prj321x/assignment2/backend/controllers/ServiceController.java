package prj321x.assignment2.backend.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prj321x.assignment2.backend.dtos.companies.CompanyDto;
import prj321x.assignment2.backend.dtos.recruitments.CategoryDto;
import prj321x.assignment2.backend.dtos.recruitments.RecruitmentDto;
import prj321x.assignment2.backend.mappers.CategoryMapper;
import prj321x.assignment2.backend.mappers.CompanyMapper;
import prj321x.assignment2.backend.mappers.RecruitmentMapper;
import prj321x.assignment2.backend.repositories.CategoryRepository;
import prj321x.assignment2.backend.repositories.CompanyRepository;
import prj321x.assignment2.backend.repositories.RecruitmentRepository;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1")
@CrossOrigin
@Getter
@Setter
@AllArgsConstructor
public class ServiceController {
    
    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;
    private final RecruitmentRepository recruitmentRepository;
    private final RecruitmentMapper recruitmentMapper;
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;
    
    @GetMapping("/company/popular")
    public ResponseEntity<CompanyDto> popularCompanyDto() {
        CompanyDto companyDto;
        try {
            companyDto = companyRepository.findByMostRecruitments().map(companyMapper::toDto)
                    .orElseThrow();
            return ResponseEntity.ok(companyDto);
        } catch (Exception e) {
           return  ResponseEntity.noContent().build();
        }
    }
    @GetMapping("/company/{id}")
    public ResponseEntity<CompanyDto> getCompanyById(@PathVariable Integer id) {
        CompanyDto companyDto;
        try {
            companyDto = companyRepository.findById(id).map(companyMapper::toDto)
                    .orElseThrow();
            return ResponseEntity.ok(companyDto);
        } catch (Exception e) {
            return ResponseEntity.noContent().build();
        }
    }
    
    @GetMapping("/recruitment/popular")
    public ResponseEntity<RecruitmentDto> popularRecruitmentDto() {
        RecruitmentDto recruitmentDto;
        try {
            recruitmentDto = recruitmentRepository.findByMostApplies().map(recruitmentMapper::toDto)
                    .orElseThrow();
            return ResponseEntity.ok(recruitmentDto);
        } catch (Exception e) {
            return ResponseEntity.noContent().build();
        }
    }
    
    @GetMapping("/category/populars")
    public ResponseEntity<Set<CategoryDto>> popularCategoryDtoSet() {
        Set<CategoryDto> categoryDtoSet =
                categoryRepository.findByMostRecruitment().stream().map(categoryMapper::toDto).collect(Collectors.toSet());
        if(categoryDtoSet.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(categoryDtoSet);
    }
}
