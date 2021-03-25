package main;

import main.basicMapper.PersonDst;
import main.basicMapper.PersonMapper;
import main.basicMapper.PersonSrc;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MapstructExampleApplicationTests {

	private PersonMapper mapper = Mappers.getMapper(PersonMapper.class);

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

}
