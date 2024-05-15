package prj321x.assignment2.backend.mappers;

import org.mapstruct.*;
import prj321x.assignment2.backend.dtos.recruitments.CategoryDto;
import prj321x.assignment2.backend.entities.recruitments.Category;
import prj321x.assignment2.backend.entities.recruitments.Recruitment;

import java.util.Set;
import java.util.stream.Collectors;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {
    Category toEntity(CategoryDto categoryDto);
    
    @Mapping(target = "recruitmentIds", expression = "java(recruitmentsToRecruitmentIds(category.getRecruitments()))")
    CategoryDto toDto(Category category);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Category partialUpdate(CategoryDto categoryDto, @MappingTarget Category category);
    
    default Set<Integer> recruitmentsToRecruitmentIds(Set<Recruitment> recruitments) {
        return recruitments.stream().map(Recruitment::getId).collect(Collectors.toSet());
    }
}