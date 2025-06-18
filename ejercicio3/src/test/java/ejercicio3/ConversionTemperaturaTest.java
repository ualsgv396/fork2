package ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ConversionTemperaturaTest {
	ConversionTemperatura ct = new ConversionTemperatura();
	
	@ParameterizedTest
    @CsvSource({"100, Celsius, Fahrenheit, 212.0","100, Celsius, Kelvin, 373.15","32, Fahrenheit, Celsius, 0.0","32, Fahrenheit, Kelvin, 273.15","300, Kelvin, Celsius, 26.85","300, Kelvin, Fahrenheit, 80.33", "100, Celsius, Celsius, 100.0","100, CELSIUS, fahrenheit, 212.0"})
    void testValidConversions(double input, String from, String to, double expected) {
        double result = ct.convertTemperature(input, from, to);
        assertEquals(expected, result, 0.000001);
    }

    @ParameterizedTest
    @CsvSource({"100, Invalid, Celsius","100, Celsius, Invalid","100, Fahrenheit, Invalid","100, Kelvin, Invalid","100, Foo, Bar"})
    void testInvalidUnits(double input, String from, String to) {
        double result = ct.convertTemperature(input, from, to);
        assertTrue(Double.isNaN(result));
    }

}
