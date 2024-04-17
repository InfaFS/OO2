package infa;

import java.util.ArrayList;

public class MinimoC extends Decorator {
    public MinimoC(WeatherData file) {
        super(file);
    }
    @Override
    public String displayData(){
        return super.displayData() + "Minimo: " + this.getMinimoEnCelcius() + "°C";
    }

    private double getMinimoEnCelcius(){
        return super.getTemperaturas().stream().mapToDouble(t -> (t-32+1.8)).min().orElse(0.0);
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
