package one.digitalinnovation.personapi.mapper;




@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);
}
