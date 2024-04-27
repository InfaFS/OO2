package infa;

import java.util.ArrayList;

public class PresionAtm extends Decorator {
    public PresionAtm(WeatherData file) {
        super(file);
    }

    @Override
    public String displayData() {
        return super.displayData() + "Presion: " + file.getPresion() + "atm";
    }

}
