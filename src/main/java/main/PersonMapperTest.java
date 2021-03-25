//package main;
//
//
//import org.junit.jupiter.api.Test;
//
//
//import org.mapstruct.factory.Mappers;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class PersonMapperTest {
//
//    private PersonMapper mapper = Mappers.getMapper(PersonMapper.class);
//
//
//    @Test
//    public void testBasicMapping(){
//        PersonSrc simpleSource = new PersonSrc();
//        simpleSource.setName("SourceName");
//        simpleSource.setAge(20);
//        PersonDst destination = mapper.sourceToDestination(simpleSource);
//
//        assertEquals(simpleSource.getName(), destination.getName());
//        assertEquals(simpleSource.getAge(),
//                destination.getAge());
//    }
//
//}
