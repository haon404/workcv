package prj321x.assignment2.backend.mappers;

import org.mapstruct.*;
import prj321x.assignment2.backend.dtos.recruitments.RecruitmentDto;
import prj321x.assignment2.backend.entities.recruitments.Recruitment;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {CompanyMapper.class})
public interface RecruitmentMapper {
    Recruitment toEntity(RecruitmentDto recruitmentDto);
    
    RecruitmentDto toDto(Recruitment recruitment);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Recruitment partialUpdate(RecruitmentDto recruitmentDto, @MappingTarget Recruitment recruitment);
}