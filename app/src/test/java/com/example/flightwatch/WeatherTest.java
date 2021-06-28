/*
 * WeatherTest
 *
 * Version 1.0
 *
 * Königsfeld, Gabriel
 * Özugurlu, Sina
 * Karampelas, Panagiotis
 * Konadu, Joshua Osei-Bonsu
 */

package com.example.flightwatch;

import junit.framework.TestCase;

public class WeatherTest extends TestCase {

    Weather weather = new Weather("kalt", 10);

    /* Constructor Tests */
    public void testGetCondition(){
        assertEquals("kalt", weather.getCondition());
    }

    public void testGetTemperature(){
        assertEquals(10, weather.getTemperature());
    }

    /* Generator Test */
    public void testWeatherGenerator(){
        Weather weather = new Weather();
        assertFalse(weather.getTemperature() > 35);
    }

}