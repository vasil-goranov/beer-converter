package com.telerik.beerconverter.controller

import com.telerik.beerconverter.services.BeerConverterService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/convertBeers")
class BeerConverterController {

    @Autowired
    BeerConverterService beerConverterService

    @GetMapping(value = "/toWhiskey/{quantity}", produces = MediaType.TEXT_PLAIN_VALUE)
    ResponseEntity convertBeerToWhiskey(@PathVariable String quantity) {
        new ResponseEntity<>(beerConverterService.toWhiskey(quantity), HttpStatus.OK)
    }

    @GetMapping(value = "/toRakia/{quantity}", produces = MediaType.TEXT_PLAIN_VALUE)
    ResponseEntity convertBeerToRakia(@PathVariable String quantity) {
        new ResponseEntity<>(beerConverterService.toRakia(quantity), HttpStatus.OK)
    }

    @GetMapping(value = "/toGin/{quantity}", produces = MediaType.TEXT_PLAIN_VALUE)
    ResponseEntity convertBeerToGin(@PathVariable String quantity) {
        new ResponseEntity<>(beerConverterService.toGin(quantity), HttpStatus.OK)
    }

    @GetMapping(value = "/toRum/{quantity}", produces = MediaType.TEXT_PLAIN_VALUE)
    ResponseEntity convertBeerToRum(@PathVariable('quantity') String quantity) {
        new ResponseEntity<>(beerConverterService.toRum(quantity), HttpStatus.OK)
    }
}
