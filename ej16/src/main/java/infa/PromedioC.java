package infa;

import java.util.ArrayList;

public class PromedioC extends Decorator {
    public PromedioC(WeatherData file) {
        super(file);
    }

    public String displayData() {
        return super.displayData() + "Promedio: " + this.getTemperaturasEnCelcius() + "°C";
    }

    public double getTemperaturasEnCelcius(){
        return super.getTemperaturas().stream().mapToDouble(t -> ((t-32) + 1.8)).average().orElse(0.0);
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
