package prj321x.assignment2.backend.mappers;

import org.mapstruct.*;
import prj321x.assignment2.backend.dtos.users.CvDto;
import prj321x.assignment2.backend.entities.users.Cv;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CvMapper {
    @Mapping(source = "userId", target = "user.id")
    Cv toEntity(CvDto cvDto);
    
    @Mapping(source = "user.id", target = "userId")
    CvDto toDto(Cv cv);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Cv partialUpdate(CvDto cvDto, @MappingTarget Cv cv);
}