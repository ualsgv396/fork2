package ejercicio3;

public class ConversionTemperatura { 
	public double convertTemperature(double temperature, String fromUnit, String toUnit) {
        fromUnit = fromUnit.toLowerCase();
        toUnit = toUnit.toLowerCase();

        if (fromUnit.equals(toUnit)) {
            return temperature;
        }

        switch (fromUnit) {
            case "celsius":
                if (toUnit.equals("fahrenheit")) {
                    return (temperature * 9 / 5) + 32;
                } else if (toUnit.equals("kelvin")) {
                    return temperature + 273.15;
                }
                break;
            case "fahrenheit":
                if (toUnit.equals("celsius")) {
                    return (temperature - 32) * 5/9;
                } else if (toUnit.equals("kelvin")) {
                    return ((temperature - 32) * 5/9) + 273.15;
                }
                break;
            case "kelvin":
                if (toUnit.equals("celsius")) {
                    return temperature - 273.15;
                } else if (toUnit.equals("fahrenheit")) {
                    return ((temperature - 273.15) * 9/5) + 32;
                }
                break;
        }

        return Double.NaN;
    }
}