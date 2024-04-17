package infa;

import java.util.ArrayList;

public class RadiacionSolar extends Decorator{
    public RadiacionSolar(WeatherData file) {
        super(file);
    }

    public String displayData(){
        return super.displayData() + "Radiacion Solar: " + this.getRadiacionSolar() + "W/m^2";
    }
    @Override
    public double getTemperatura() {
        return super.getTemperatura();
    }
    @Override
    public double getPresion() {
        return super.getPresion();
    }
    @Override
    public double getRadiacionSolar() {
        return super.getRadiacionSolar();
    }

    @Override
    public ArrayList<Double> getTemperaturas(){
        return super.getTemperaturas();
    }
}
