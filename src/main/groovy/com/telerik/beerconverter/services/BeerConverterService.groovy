package com.telerik.beerconverter.services

import com.telerik.beerconverter.mapper.DrinksMapper
import org.springframework.stereotype.Service

@Service
class BeerConverterService {

    String toWhiskey(String beerQuantity) {
        DrinksMapper.howManyWhiskeysIsThis(beerQuantity)
    }

    String toRakia(String beerQuantity) {
        DrinksMapper.howManyRakiasIsThis(beerQuantity)
    }

    String toGin(String beerQuantity) {
        DrinksMapper.howManyGinsIsThis(beerQuantity)
    }

    String toRum(String beerQuantity) {
        DrinksMapper.howManyRumsIsThis(beerQuantity)
    }
}
