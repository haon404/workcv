package prj321x.assignment2.backend.mappers;

import org.mapstruct.*;
import prj321x.assignment2.backend.dtos.recruitments.RecruitmentDto;
import prj321x.assignment2.backend.entities.recruitments.Recruitment;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RecruitmentMapper {
    @Mapping(source = "companyId", target = "company.id")
    Recruitment toEntity(RecruitmentDto recruitmentDto);
    
    @Mapping(source = "company.id", target = "companyId")
    RecruitmentDto toDto(Recruitment recruitment);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Recruitment partialUpdate(RecruitmentDto recruitmentDto, @MappingTarget Recruitment recruitment);
}