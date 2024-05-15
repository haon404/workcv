package prj321x.assignment2.backend.mappers;

import org.mapstruct.*;
import prj321x.assignment2.backend.dtos.recruitments.RecruitmentApplyDto;
import prj321x.assignment2.backend.entities.recruitments.RecruitmentApply;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RecruitmentApplyMapper {
    @Mapping(source = "userId", target = "user.id")
    @Mapping(source = "recruitmentId", target = "recruitment.id")
    RecruitmentApply toEntity(RecruitmentApplyDto recruitmentApplyDto);
    
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "recruitment.id", target = "recruitmentId")
    RecruitmentApplyDto toDto(RecruitmentApply recruitmentApply);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    RecruitmentApply partialUpdate(RecruitmentApplyDto recruitmentApplyDto, @MappingTarget RecruitmentApply recruitmentApply);
}