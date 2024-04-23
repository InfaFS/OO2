package infa;

import java.time.LocalDate;

public abstract class ProductoFinanciero {
    private LocalDate fechaOperacion;

    public ProductoFinanciero(){
        this.fechaOperacion = LocalDate.now();
    }

    public LocalDate getfechaOperacion(){
        return this.fechaOperacion;
    }
    
    public abstract double retornoInversion(double montoInicial);
}
