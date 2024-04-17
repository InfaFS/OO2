package infa;

import java.util.ArrayList;

public class PresionAtm extends Decorator {
    public PresionAtm(WeatherData file) {
        super(file);
    }

    @Override
    public String displayData() {
        return super.displayData() + "Presion: " + this.getPresion() + "atm";
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
