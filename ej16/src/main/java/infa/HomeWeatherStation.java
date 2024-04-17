package infa;

import java.util.ArrayList;
 
public class HomeWeatherStation implements WeatherData {
    private double temperatura;
    private double presion;
    private double radiacionSolar;
    private ArrayList<Double> temperaturas;

    public HomeWeatherStation() {
        this.temperatura = 86.0;
        this.presion = 1008.0;
        this.radiacionSolar = 200.0;
        this.temperaturas = new ArrayList<Double>();
    }

    public double getTemperatura() {
        return this.temperatura;
    }

    public void addTemperatura(double temperatura) {
        this.temperaturas.add(temperatura);
    }

    public double getPresion() {
        return this.presion;
    }

    public double getRadiacionSolar() {
        return this.radiacionSolar;
    }

    public ArrayList<Double> getTemperaturas() {
        return this.temperaturas;
    }

    public String displayData() {
        return "Not working yet.";
    }

}
