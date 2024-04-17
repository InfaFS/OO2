package infa;

import java.util.ArrayList;

public abstract class Decorator implements WeatherData{
    protected WeatherData file;

    public Decorator(WeatherData file) {
        this.file = file;
    }
    @Override
    public double getTemperatura() {
        return file.getTemperatura();
    }
    @Override
    public double getPresion() {
        return file.getPresion();
    }
    @Override
    public double getRadiacionSolar() {
        return file.getRadiacionSolar();
    }
    @Override
    public String displayData() {
        return file.displayData();
    }
    @Override
    public ArrayList<Double> getTemperaturas(){
        return file.getTemperaturas();
    }
  

}
