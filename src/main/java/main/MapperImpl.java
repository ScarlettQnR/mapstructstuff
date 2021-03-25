package main;

public class MapperImpl implements PersonMapper {

    @Override
    public PersonDst sourceToDestination(PersonSrc source) {
        if ( source == null ) {
            return null;
        }
        PersonDst simpleDestination = new PersonDst();
        simpleDestination.setName( source.getName() );
        simpleDestination.setAge( source.getAge() );
        return simpleDestination;
    }
    @Override
    public PersonSrc destinationToSource(PersonDst destination){
        if ( destination == null ) {
            return null;
        }
        PersonSrc simpleSource = new PersonSrc();
        simpleSource.setName( destination.getName() );
        simpleSource.setAge( destination.getAge() );
        return simpleSource;
    }


}
