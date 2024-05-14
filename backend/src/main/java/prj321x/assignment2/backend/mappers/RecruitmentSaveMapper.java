package prj321x.assignment2.backend.mappers;

import org.mapstruct.*;
import prj321x.assignment2.backend.dtos.recruitments.RecruitmentSaveDto;
import prj321x.assignment2.backend.entities.recruitments.RecruitmentSave;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {RecruitmentMapper.class, ApplicantMapper.class})
public interface RecruitmentSaveMapper {
    RecruitmentSave toEntity(RecruitmentSaveDto recruitmentSaveDto);
    
    RecruitmentSaveDto toDto(RecruitmentSave recruitmentSave);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    RecruitmentSave partialUpdate(RecruitmentSaveDto recruitmentSaveDto, @MappingTarget RecruitmentSave recruitmentSave);
}