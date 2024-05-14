package prj321x.assignment2.backend.mappers;

import org.mapstruct.*;
import prj321x.assignment2.backend.dtos.users.LoginDto;
import prj321x.assignment2.backend.entities.users.User;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface LoginMapper {
    User toEntity(LoginDto loginDTO);
    
    LoginDto toDto(User user);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User partialUpdate(LoginDto loginDTO, @MappingTarget User user);
}