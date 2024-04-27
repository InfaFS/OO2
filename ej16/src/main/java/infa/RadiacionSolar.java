package infa;

import java.util.ArrayList;

public class RadiacionSolar extends Decorator{
    public RadiacionSolar(WeatherData file) {
        super(file);
    }

    public String displayData(){
        return super.displayData() + "Radiacion Solar: " + file.getRadiacionSolar() + "W/m^2";
    }
    
}
