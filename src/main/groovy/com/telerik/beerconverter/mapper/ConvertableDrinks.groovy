package com.telerik.beerconverter.mapper

enum ConvertableDrinks {
    WHISKEY ('whiskey', 'If you had some real alcohol, it would be this much - '),
    RAKIA('rakia', 'If you had some of your Grandpa\'s special, it would be this much - '),
    GIN('gin', 'If you had some summer happiness, it would be this much - '),
    RUM('rum', 'If you wanted some bad hangover, you would have had this much - ')

    ConvertableDrinks(String name, String alcoholMessage) {
        this.name = name
        this.alcoholMessage = alcoholMessage
    }

    private String name
    private String alcoholMessage

    String getName() {
        return name
    }

    String getAlcoholMessage() {
        return alcoholMessage
    }
}