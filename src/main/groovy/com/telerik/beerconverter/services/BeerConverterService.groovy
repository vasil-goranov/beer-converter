package com.telerik.beerconverter.services

import com.telerik.beerconverter.mapper.ConvertableDrinks
import com.telerik.beerconverter.mapper.DrinksMapper
import org.springframework.stereotype.Service

@Service
class BeerConverterService {

    String toRealAlcohol(String beerQuantity, ConvertableDrinks drink) {
        DrinksMapper.calculateRealAlcoholQuantity(beerQuantity, drink)
    }
}
