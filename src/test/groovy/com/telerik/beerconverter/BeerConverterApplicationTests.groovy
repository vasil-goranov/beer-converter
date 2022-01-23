package com.telerik.beerconverter

import com.telerik.beerconverter.mapper.ConvertableDrinks
import com.telerik.beerconverter.services.BeerConverterService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BeerConverterApplicationTests {

	@Autowired
	BeerConverterService service

	@Test
	void testBeerConverterServiceHappyPath() {
		String expectedResult = service.toRealAlcohol("3", ConvertableDrinks.GIN)
		assert expectedResult == 'If you had some summer happiness, it would be this much - 150ml'
		expectedResult = service.toRealAlcohol("5", ConvertableDrinks.RAKIA)
		assert expectedResult == 'If you had some of your Grandpa\'s special, it would be this much - 125ml'
		expectedResult = service.toRealAlcohol("10", ConvertableDrinks.RUM)
		assert expectedResult == 'If you wanted some bad hangover, you would have had this much - 1000ml'
		expectedResult = service.toRealAlcohol"5.3", ConvertableDrinks.WHISKEY
		assert expectedResult == 'If you had some real alcohol, it would be this much - 177ml'
	}

	@Test
	void testBeerConverterServiceError() {

		String expectedResult = service.toRealAlcohol("5,3", ConvertableDrinks.WHISKEY)
		assert expectedResult == ('Number error! Character , is neither a decimal digit number, decimal point, nor "e" notation exponential mark.')
		expectedResult = service.toRealAlcohol("-5", ConvertableDrinks.WHISKEY)
		assert expectedResult == ('Number error! Please use valid number, greater than 0')
	}

}
