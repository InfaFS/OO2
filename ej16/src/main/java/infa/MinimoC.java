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
        return file.getTemperaturas().stream().mapToDouble(t -> (t-32+1.8)).min().orElse(0.0);
    }
    
}
