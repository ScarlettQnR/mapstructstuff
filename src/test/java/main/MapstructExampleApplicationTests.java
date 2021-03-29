package main;

import main.basicMapper.PersonDst;
import main.basicMapper.PersonMapper;
import main.basicMapper.PersonSrc;
import main.childBeans.DivisionDto;
import main.childBeans.Employee;
import main.childBeans.EmployeeDto;
import main.childBeans.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MapstructExampleApplicationTests {

	private PersonMapper mapper = Mappers.getMapper(PersonMapper.class);
	 EmployeeMapper employeeMapper = Mappers.getMapper(EmployeeMapper.class);
	@Test
	void contextLoads() {
	}


	@Test
	public void basicMapperSrcToDstTest(){
		PersonSrc simpleSource = new PersonSrc();
		simpleSource.setName("SourceName");
		simpleSource.setAge(20);
		PersonDst destination = mapper.sourceToDestination(simpleSource);

		assertEquals(simpleSource.getName(), destination.getName());
		assertEquals(simpleSource.getAge(),
				destination.getAge());
	}

	@Test
	public void basicMapperDstToSrcTest(){
		PersonDst simpleDest = new PersonDst();
		simpleDest.setName("SourceName");
		simpleDest.setAge(20);
		PersonSrc source = mapper.destinationToSource(simpleDest);

		assertEquals(source.getName(), simpleDest.getName());
		assertEquals(source.getAge(),
				simpleDest.getAge());
	}

	@Test
	public void givenEmpDTONestedMappingToEmp_whenMaps_thenCorrect() {
		EmployeeDto dto = new EmployeeDto();
		dto.setDivision(new DivisionDto(1, "Division1"));
		Employee entity = employeeMapper.employeeDTOtoEmployee(dto);
		assertEquals(dto.getDivision().getId(),
				entity.getDivision().getId());
		assertEquals(dto.getDivision().getName(),
				entity.getDivision().getName());
	}

}
