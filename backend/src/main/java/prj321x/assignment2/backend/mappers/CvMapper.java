package prj321x.assignment2.backend.mappers;

import org.mapstruct.*;
import prj321x.assignment2.backend.dtos.users.CvDto;
import prj321x.assignment2.backend.entities.users.Cv;
import prj321x.assignment2.backend.entities.users.User;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {ApplicantMapper.class})
public interface CvMapper {
    Cv toEntity(CvDto cvDto);
    
    @AfterMapping
    default void linkUser(@MappingTarget Cv cv) {
        User user = cv.getUser();
        if (user != null) {
            user.setCv(cv);
        }
    }
    
    CvDto toDto(Cv cv);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Cv partialUpdate(CvDto cvDto, @MappingTarget Cv cv);
}