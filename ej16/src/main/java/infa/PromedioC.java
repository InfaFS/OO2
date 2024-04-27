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
        return file.getTemperaturas().stream().mapToDouble(t -> ((t-32) + 1.8)).average().orElse(0.0);
    }


}
