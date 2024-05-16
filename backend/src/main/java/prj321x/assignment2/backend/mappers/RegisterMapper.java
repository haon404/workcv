package prj321x.assignment2.backend.mappers;

import org.mapstruct.*;
import prj321x.assignment2.backend.dtos.users.RegisterDto;
import prj321x.assignment2.backend.entities.users.User;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RegisterMapper {
    User toEntity(RegisterDto registerDto);
    
    RegisterDto toDto(User user);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User partialUpdate(RegisterDto registerDto, @MappingTarget User user);
}