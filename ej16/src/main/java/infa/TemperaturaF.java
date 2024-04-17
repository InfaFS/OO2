package infa;

import java.util.ArrayList;

public class TemperaturaF extends Decorator {
    
    public TemperaturaF (WeatherData file) {
        super(file);
    }

    public String displayData(){
        return super.displayData() + "Temperatura: " + this.getTemperaturaEnFahrenheit() + "°F";
    }
    
    private double getTemperaturaEnFahrenheit(){
        return super.getTemperatura();
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
