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
        return file.getTemperaturas().stream().mapToDouble(t -> (t-32)*5/9).max().orElse(0.0);
    }
   

}
