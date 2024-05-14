package prj321x.assignment2.backend.mappers;

import org.mapstruct.*;
import prj321x.assignment2.backend.dtos.users.RecruiterDto;
import prj321x.assignment2.backend.entities.users.User;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RecruiterMapper {
    User toEntity(RecruiterDto recruiterDTO);
    
    RecruiterDto toDto(User user);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User partialUpdate(RecruiterDto recruiterDTO, @MappingTarget User user);
}