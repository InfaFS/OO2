package infa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Vehiculo {
    private Seguro seguro;
    private double valor;
    private int ocupantes;
    private LocalDate fechaAdiquision;

    public Vehiculo ( double valor, int ocupantes, LocalDate fechaAdiquision){
        this.valor=valor;
        this.ocupantes=ocupantes;
        this.fechaAdiquision=fechaAdiquision;
    }
    public int getOcupantes() {
        return this.ocupantes;
    }

    public double getValor() {
        return this.valor;
    }

    public int getAntiguedad() {
        return (int) ChronoUnit.YEARS.between(fechaAdiquision,LocalDateTime.now());
    }

    public double getCostoSeguro(){
    return this.seguro.getCostoSeguro();
    }

    public double getPorcientoValor(Double porcentaje) {
        return this.valor * porcentaje;
    }

    public void setSeguro (Seguro seguro) {
        this.seguro=seguro;
    }

}
