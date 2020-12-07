package io.github.computeruser88.beerservice.repositories;

import io.github.computeruser88.beerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by Jan Balangue on 12/6/20.
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
