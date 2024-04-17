package infa;

import java.util.ArrayList;

public class MaximoF extends Decorator {
    public MaximoF(WeatherData file) {
        super(file);
    }

    @Override
    public String displayData() {
        return super.displayData() + "Temperatura Maxima: " + this.getMaximo() + "°F";
    }

    private double getMaximo() {
        return super.getTemperaturas().stream().mapToDouble(t -> t).max().orElse(0.0);
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
