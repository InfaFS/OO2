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
        return file.getTemperaturas().stream().mapToDouble(t -> t).average().orElse(0.0);
    }


}
