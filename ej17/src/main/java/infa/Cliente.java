package infa;

public abstract class Cliente {
    private int parking;
    private double tasa;
    private int plazo;
    public Cliente(int parking, double tasa, int plazoMinimo){
        this.parking = parking;
        this.tasa = tasa;
        this.plazo = plazoMinimo;
    }

    public double getTasa(){
        return this.tasa;
    }

    public int getParking(){
        return this.parking;
    }

    public int getPlazo(){
        return this.plazo;
    }
}
