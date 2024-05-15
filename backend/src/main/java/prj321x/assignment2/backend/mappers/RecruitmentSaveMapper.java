package prj321x.assignment2.backend.mappers;

import org.mapstruct.*;
import prj321x.assignment2.backend.dtos.recruitments.RecruitmentSaveDto;
import prj321x.assignment2.backend.entities.recruitments.RecruitmentSave;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RecruitmentSaveMapper {
    @Mapping(source = "userId", target = "user.id")
    @Mapping(source = "recruitmentId", target = "recruitment.id")
    RecruitmentSave toEntity(RecruitmentSaveDto recruitmentSaveDto);
    
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "recruitment.id", target = "recruitmentId")
    RecruitmentSaveDto toDto(RecruitmentSave recruitmentSave);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    RecruitmentSave partialUpdate(RecruitmentSaveDto recruitmentSaveDto, @MappingTarget RecruitmentSave recruitmentSave);
}