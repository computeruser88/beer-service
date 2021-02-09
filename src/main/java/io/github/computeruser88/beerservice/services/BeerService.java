package io.github.computeruser88.beerservice.services;

import io.github.computeruser88.beerservice.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by Jan Balangue on 2/8/21.
 */
public interface BeerService {
    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
