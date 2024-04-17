package infa;

import java.util.ArrayList;

public interface WeatherData {
    public double getTemperatura();
    public double getPresion();
    public double getRadiacionSolar();
    public ArrayList<Double> getTemperaturas();
    public String displayData();
}
