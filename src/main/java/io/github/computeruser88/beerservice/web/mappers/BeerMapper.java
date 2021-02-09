package io.github.computeruser88.beerservice.web.mappers;

import io.github.computeruser88.beerservice.domain.Beer;
import io.github.computeruser88.beerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by Jan Balangue on 2/8/21.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}

