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
        return file.getTemperaturas().stream().mapToDouble(t -> t).min().orElse(0.0);
    }
   
}
