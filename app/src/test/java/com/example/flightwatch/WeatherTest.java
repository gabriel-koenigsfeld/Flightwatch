package com.example.flightwatch;

import junit.framework.TestCase;

public class WeatherTest extends TestCase {

    Weather weather = new Weather("kalt", 10);

    //Constructor Tests
    public void testGetCondition(){
        assertEquals("kalt", weather.getCondition());
    }

    public void testGetTemperature(){
        assertEquals(10, weather.getTemperature());
    }

    //Generator Test
    public void testWeatherGenerator(){
        Weather weather = new Weather();
        assertFalse(weather.getTemperature() > 35);
    }

}