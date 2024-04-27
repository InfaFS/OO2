package infa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @BeforeEach
    void setUp() throws Exception {
        
    }
 
    @Test
    public void testGlobal()
    {
        HomeWeatherStation weatherData = new HomeWeatherStation();
        weatherData.addTemperatura(500.0);
        weatherData.addTemperatura(600.0);
        weatherData.addTemperatura(700.0);
        weatherData.addTemperatura(800.0);
        HomeWeatherInfa weatherInfa = new HomeWeatherInfa(weatherData);
        TemperaturaF temperaturaF = new TemperaturaF(weatherInfa);
        PresionAtm presionAtm = new PresionAtm(temperaturaF);
        RadiacionSolar radiacionSolar = new RadiacionSolar(presionAtm);
        System.out.println(radiacionSolar.displayData());

        HomeWeatherStation weatherData2 = new HomeWeatherStation();
        weatherData2.addTemperatura(500.0);
        weatherData2.addTemperatura(600.0);
        weatherData2.addTemperatura(700.0);
        weatherData2.addTemperatura(800.0); 
        HomeWeatherInfa weatherInfa2 = new HomeWeatherInfa(weatherData2);
        System.out.println(weatherInfa2.getTemperaturas());
        TemperaturaC temperaturaC = new TemperaturaC(weatherInfa2);
        PresionAtm presionAtm2 = new PresionAtm(temperaturaC);
        RadiacionSolar radiacionSolar2 = new RadiacionSolar(presionAtm2);
        MinimoC minimoC = new MinimoC(radiacionSolar2);
        MaximoC maximoC = new MaximoC(minimoC);
        PromedioC promedioC = new PromedioC(maximoC);
        System.out.println(promedioC.displayData());

        HomeWeatherStation weatherData3 = new HomeWeatherStation();
        weatherData3.addTemperatura(500.0);
        weatherData3.addTemperatura(600.0);
        weatherData3.addTemperatura(700.0);
        weatherData3.addTemperatura(800.0);
        HomeWeatherInfa weatherInfa3 = new HomeWeatherInfa(weatherData3);
        TemperaturaF temperaturaC2 = new TemperaturaF(weatherInfa3);
        PresionAtm presionAtm3 = new PresionAtm(temperaturaC2);
        RadiacionSolar radiacionSolar3 = new RadiacionSolar(presionAtm3);
        MinimoF minimoC2 = new MinimoF(radiacionSolar3);
        MaximoF maximoC2 = new MaximoF(minimoC2);
        PromedioF promedioC2 = new PromedioF(maximoC2);
        System.out.println(promedioC2.displayData());

    }


}
