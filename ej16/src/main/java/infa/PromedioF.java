package infa;

import java.util.ArrayList;

public class PromedioF extends Decorator{
    public PromedioF(WeatherData file) {
        super(file);
    }

    @Override
    public String displayData(){
        return super.displayData() + "Promedio: " + this.getPromedioTemperaturasEnF() + "°F";
    }

    private double getPromedioTemperaturasEnF(){
        return super.getTemperaturas().stream().mapToDouble(t -> t).average().orElse(0.0);
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
