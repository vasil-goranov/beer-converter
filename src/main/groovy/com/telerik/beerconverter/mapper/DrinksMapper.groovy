package com.telerik.beerconverter.mapper

import java.math.RoundingMode

class DrinksMapper {

    static def alcoholToNumberOfBeersRatio = [
            (ConvertableDrinks.GIN.name()): 2,
            (ConvertableDrinks.RAKIA.name()): 4,
            (ConvertableDrinks.WHISKEY.name()): 3,
            (ConvertableDrinks.RUM.name()): 1
    ]

    static String howManyWhiskeysIsThis(String beerQuantity) {
        int whiskeyRatio = alcoholToNumberOfBeersRatio[ConvertableDrinks.WHISKEY.name()]
        String result = (new BigDecimal(beerQuantity).divide(new BigDecimal(whiskeyRatio), 2, RoundingMode.HALF_UP) * 100).intValue().toString()
        "If you had some real alcohol, it would be this much - ${result}ml"
    }

    static String howManyGinsIsThis(String beerQuantity) {
        int ginRatio = alcoholToNumberOfBeersRatio[ConvertableDrinks.GIN.name()]
        String result = (new BigDecimal(beerQuantity).divide(new BigDecimal(ginRatio), 2, RoundingMode.HALF_UP) * 100).intValue().toString()
        "If you had some summer happiness, it would be this much - ${result}ml"
    }

    static String howManyRumsIsThis(String beerQuantity) {
        int rumRatio = alcoholToNumberOfBeersRatio[ConvertableDrinks.RUM.name()]
        String result = (new BigDecimal(beerQuantity).divide(new BigDecimal(rumRatio), 2, RoundingMode.HALF_UP) * 100).intValue().toString()
        "If you wanted some bad hangover, you would have had this much - ${result}ml"
    }

    static String howManyRakiasIsThis(String beerQuantity) {
        int rakiaRatio = alcoholToNumberOfBeersRatio[ConvertableDrinks.RAKIA.name()]
        String result = (new BigDecimal(beerQuantity).divide(new BigDecimal(rakiaRatio), 2, RoundingMode.HALF_UP) * 100).intValue().toString()
        "If you had some of your Grandpa's special, it would be this much - ${result}ml"
    }
}
