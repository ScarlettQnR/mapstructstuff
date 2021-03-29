package main.childBeans;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
@Mapper
public interface EmployeeMapper {

    DivisionDto divisionToDivisionDTO(Division entity);

    Division divisionDTOtoDivision(DivisionDto dto);

    @Mappings({
            @Mapping(target="employeeId", source="entity.id"),
            @Mapping(target="employeeName", source="entity.name")
    })
    EmployeeDto employeeToEmployeeDTO(Employee entity);
    @Mappings({
            @Mapping(target="id", source="dto.employeeId"),
            @Mapping(target="name", source="dto.employeeName")
    })
    Employee employeeDTOtoEmployee(EmployeeDto dto);
}
