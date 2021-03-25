package main;

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
	public void testBasicMapping(){
		PersonSrc simpleSource = new PersonSrc();
		simpleSource.setName("SourceName");
		simpleSource.setAge(20);
		PersonDst destination = mapper.sourceToDestination(simpleSource);

		assertEquals(simpleSource.getName(), destination.getName());
		assertEquals(simpleSource.getAge(),
				destination.getAge());
	}

}
