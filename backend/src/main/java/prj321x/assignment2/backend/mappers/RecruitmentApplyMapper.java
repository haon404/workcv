package prj321x.assignment2.backend.mappers;

import org.mapstruct.*;
import prj321x.assignment2.backend.dtos.recruitments.RecruitmentApplyDto;
import prj321x.assignment2.backend.entities.recruitments.RecruitmentApply;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {RecruitmentMapper.class, ApplicantMapper.class, CvMapper.class})
public interface RecruitmentApplyMapper {
    RecruitmentApply toEntity(RecruitmentApplyDto recruitmentApplyDto);
    
    RecruitmentApplyDto toDto(RecruitmentApply recruitmentApply);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    RecruitmentApply partialUpdate(RecruitmentApplyDto recruitmentApplyDto, @MappingTarget RecruitmentApply recruitmentApply);
}