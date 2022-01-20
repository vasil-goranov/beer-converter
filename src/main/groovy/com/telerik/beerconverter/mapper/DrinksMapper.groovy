package com.telerik.beerconverter.mapper

import java.math.RoundingMode

class DrinksMapper {

    static def alcoholToNumberOfBeersRatio = [
            (ConvertableDrinks.GIN.getName()): 2,
            (ConvertableDrinks.RAKIA.getName()): 4,
            (ConvertableDrinks.WHISKEY.getName()): 3,
            (ConvertableDrinks.RUM.getName()): 1
    ]

    static String calculateRealAlcoholQuantity(String beerQuantity, ConvertableDrinks drink) {
        int alcoholRatio = alcoholToNumberOfBeersRatio[drink.getName()]
        BigDecimal quantity
        try {
            quantity = new BigDecimal(beerQuantity)
            if(quantity < 0) {
                throw new NumberFormatException("Please use valid number, greater than 0")
            }
        }
        catch (NumberFormatException e) {
            return 'Number error! ' + e.getMessage()
        }
        drink.getAlcoholMessage() + (quantity.divide(new BigDecimal(alcoholRatio), 2, RoundingMode.HALF_UP) * 100).intValue().toString() + 'ml'
    }
}
