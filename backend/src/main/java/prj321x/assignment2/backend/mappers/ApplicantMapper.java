package prj321x.assignment2.backend.mappers;

import org.mapstruct.*;
import prj321x.assignment2.backend.dtos.users.ApplicantDto;
import prj321x.assignment2.backend.entities.users.User;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ApplicantMapper {
    User toEntity(ApplicantDto userDto);
    
    ApplicantDto toDto(User user);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User partialUpdate(ApplicantDto userDto, @MappingTarget User user);
}