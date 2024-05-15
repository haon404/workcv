package prj321x.assignment2.backend.mappers;

import org.mapstruct.*;
import prj321x.assignment2.backend.dtos.companies.CompanyFollowDto;
import prj321x.assignment2.backend.entities.companies.CompanyFollow;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CompanyFollowMapper {
    @Mapping(source = "userId", target = "user.id")
    @Mapping(source = "companyId", target = "company.id")
    CompanyFollow toEntity(CompanyFollowDto companyFollowDto);
    
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "company.id", target = "companyId")
    CompanyFollowDto toDto(CompanyFollow companyFollow);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CompanyFollow partialUpdate(CompanyFollowDto companyFollowDto, @MappingTarget CompanyFollow companyFollow);
}