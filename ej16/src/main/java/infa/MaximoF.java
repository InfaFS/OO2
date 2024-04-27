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
        return file.getTemperaturas().stream().mapToDouble(t -> t).max().orElse(0.0);
    }
    
}
