package com.telerik.beerconverter.mapper

enum ConvertableDrinks {
    WHISKEY ('whiskey'),
    RAKIA('rakia'),
    GIN('gin'),
    RUM('rum')

    ConvertableDrinks(String name) {
        this.name = name
    }

    private String name
}