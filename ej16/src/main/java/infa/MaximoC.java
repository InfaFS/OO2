package infa;

import java.util.ArrayList;

public class MaximoC extends Decorator{
    public MaximoC(WeatherData file) {
        super(file);
    }

    @Override
    public String displayData(){
        return super.displayData() + "Temperatura Maxima: " + this.getMaximoEnCelcius() + "°C";
    }

    private double getMaximoEnCelcius(){
        return super.getTemperaturas().stream().mapToDouble(t -> (t-32)*5/9).max().orElse(0.0);
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
