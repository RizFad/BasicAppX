package org.aplas.basicappx;

public class Temperature {

    private double celcius;

    Temperature() {
        this.celcius = 0;
    }

    double getCelcius() {
        return celcius;
    }

    void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    double getFahrenheit() {
        return celcius * 1.8000 + 32.00;
    }

    void setFahrenheit(double fahrenheit) {
        this.celcius = (fahrenheit - 32) * 5 / 9;
    }

    double getKelvins() {
        return celcius + 273.15;
    }

    void setKelvins(double K) {
        this.celcius = K - 273.15;
    }

    double convert(String oriUnit, String convUnit, double value) {
        if (oriUnit.equals("°C") && convUnit.equals("°F")) {
            setCelcius(value);
            return getFahrenheit();
        } else if (oriUnit.equals("°C") && convUnit.equals("K")) {
            setCelcius(value);
            return getKelvins();
        } else if (oriUnit.equals("°F") && convUnit.equals("°C")) {
            setFahrenheit(value);
            return getCelcius();
        } else if (oriUnit.equals("°F") && convUnit.equals("K")) {
            setFahrenheit(value);
            return getKelvins();
        } else if (oriUnit.equals("K") && convUnit.equals("°C")) {
            setKelvins(value);
            return getCelcius();
        } else if (oriUnit.equals("K") && convUnit.equals("°F")) {
            setKelvins(value);
            return getFahrenheit();
        } else {
            return value;
        }
    }
}
