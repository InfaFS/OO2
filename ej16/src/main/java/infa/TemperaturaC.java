package infa;

import java.util.ArrayList;

public class TemperaturaC extends Decorator{
    public TemperaturaC(WeatherData file) {
        super(file);
    }

    @Override
    public String displayData(){
        return super.displayData() + "Temperatura: " + this.getTemperaturaEnCelcius() + "°C";
    }

    private double getTemperaturaEnCelcius(){
        return ((super.getTemperatura()-32) + 1.8);
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
