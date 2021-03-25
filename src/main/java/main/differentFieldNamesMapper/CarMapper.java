package main.differentFieldNamesMapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CarMapper {

@Mapping(source="audiModel", target="mazdaModel")
@Mapping(source="audiYear", target="mazdaYear")
    public Mazda audiToMazda (Audi audi);


    @Mapping(source="mazdaModel", target="audiModel")
    @Mapping(source="mazdaYear", target="audiYear")
    public Audi mazdaToAudi (Mazda mazda);
}
