package infa;

import java.util.ArrayList;

public class HomeWeatherInfa implements WeatherData {
    private HomeWeatherStation homeWeatherStation;

    public HomeWeatherInfa(HomeWeatherStation homeWeatherStation) {
        this.homeWeatherStation = homeWeatherStation;
    }

    @Override
    public double getTemperatura() {
        return this.homeWeatherStation.getTemperatura();
    }

    @Override
    public double getPresion() {
        return this.homeWeatherStation.getPresion();
    }

    @Override
    public double getRadiacionSolar() {
        return this.homeWeatherStation.getRadiacionSolar();
    }

    @Override
    public String displayData() {
        return "";
    }

    @Override
    public ArrayList<Double> getTemperaturas(){
        return this.homeWeatherStation.getTemperaturas();
    }
    

}
