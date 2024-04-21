package infa;

public class Proyecto {

    private String nombre;
    private String fechaInicio;
    private String fechaFin;
    private String objetivo;
    private double montoPagoIntegranteDia;
    private int numIntegrantes;
    private double margenDeGanancias;

    private ProyectState state;

    public Proyecto(String nombre, String fechaInicio, String fechaFin, String objetivo,int numIntegrantes, double montoPagoIntegranteDia) {
        this.state = new EnConstruccion();
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.objetivo = objetivo;
        this.numIntegrantes = numIntegrantes;
        this.montoPagoIntegranteDia = montoPagoIntegranteDia;
        this.margenDeGanancias = 0.07;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getFechaInicio() {
        return this.fechaInicio;
    }

    public String getFechaFin() {
        return this.fechaFin;
    }

    public String getObjetivo() {
        return this.objetivo;
    }

    public double getMontoPagoIntegranteDia() {
        return this.montoPagoIntegranteDia;
    }

    public int getNumIntegrantes() {
        return this.numIntegrantes;
    }

    public void setState(ProyectState state) {
        this.state = state;
    }

    public void setGanacia(double gananciaNueva){
        this.margenDeGanancias = gananciaNueva;
    }

    public void modificarMargenGanacias(double gananciaNueva){
        this.state.modificarMargenGanacias(this,gananciaNueva);
    }

    public void aprobarEtapa(){
        this.state.aprobarEtapa(this);
    }

    public void cancelarProyecto(){
        this.state.cancelarProyecto(this);
    }


    public void setObjetivo (String objetivo) {
        this.objetivo = objetivo;
    }

    public double getMargenDeGanancias() {
        return this.margenDeGanancias;

    }
    


}
