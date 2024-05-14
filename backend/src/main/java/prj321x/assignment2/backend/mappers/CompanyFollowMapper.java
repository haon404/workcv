package prj321x.assignment2.backend.mappers;

import org.mapstruct.*;
import prj321x.assignment2.backend.dtos.companies.CompanyFollowDto;
import prj321x.assignment2.backend.entities.companies.CompanyFollow;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {CompanyMapper.class, ApplicantMapper.class})
public interface CompanyFollowMapper {
    CompanyFollow toEntity(CompanyFollowDto companyFollowDto);
    
    CompanyFollowDto toDto(CompanyFollow companyFollow);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CompanyFollow partialUpdate(CompanyFollowDto companyFollowDto, @MappingTarget CompanyFollow companyFollow);
}