package infa;

import java.util.ArrayList;

public class MinimoF extends Decorator{
    public MinimoF(WeatherData file) {
        super(file);
    }

    public String displayData(){
        return super.displayData() + "Minimo: " + this.getMinimoF() + "°F";
    }

    private double getMinimoF(){
        return this.getTemperaturas().stream().mapToDouble(t -> t).min().orElse(0.0);
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
