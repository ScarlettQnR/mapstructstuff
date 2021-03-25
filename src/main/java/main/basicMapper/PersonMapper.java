package main.basicMapper;

import org.mapstruct.Mapper;


@Mapper
public interface PersonMapper {
    PersonDst sourceToDestination (PersonSrc source);
    PersonSrc destinationToSource (PersonDst destination);

}
