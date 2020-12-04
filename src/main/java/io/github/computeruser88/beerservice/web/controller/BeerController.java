package io.github.computeruser88.beerservice.web.controller;

import io.github.computeruser88.beerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by Jan Balangue on 2020-12-03.
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {

        // todo impl
        return new ResponseEntity<>(BeerDto.builder().build());
    }

    @PostMapping
    public ResponseEntity<BeerDto> saveNewBeer(@RequestBody BeerDto beerDto) {

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId) {

        // todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}