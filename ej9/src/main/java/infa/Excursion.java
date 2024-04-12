package infa;
import java.time.LocalDateTime;
import java.util.*;

public class Excursion {
    private String nombre;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String puntoDeEncuentro;
    private int costo;
    private int cupoMin;
    private int cupoMax;
    private ArrayList<Usuario> inscriptos;
    private ExcursionState state;
    private ArrayList<Usuario> listaDeEspera;

    public Excursion(String nombre, LocalDateTime fechaInicio, LocalDateTime fechaFin, String puntoDeEncuentro, int costo, int cupoMin, int cupoMax){
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puntoDeEncuentro = puntoDeEncuentro;
        this.costo = costo;
        this.cupoMin = cupoMin;
        this.cupoMax = cupoMax;
        this.inscriptos = new ArrayList<Usuario>();
        this.listaDeEspera = new ArrayList<Usuario>();
        this.state = new Provisioria();
    }

    public String getNombre() {
        return this.nombre;
    }
    public LocalDateTime getFechaInicio() {
        return this.fechaInicio;
    }
    public LocalDateTime getFechaFin() {
        return this.fechaFin;
    }
    public String getPuntoDeEncuentro() {
        return this.puntoDeEncuentro;
    }
    public int getCosto() {
        return this.costo;
    }
    public int getCupoMin() {
        return this.cupoMin;
    }
    public int getCupoMax() {
        return this.cupoMax;
    }
    public ArrayList<Usuario> getInscriptos() {
        return this.inscriptos;
    }   
    public void addUsuarioExcursion(Usuario usuario){
        this.inscriptos.add(usuario);
    }
    public void addUsuarioListaEspera(Usuario usuario){
        this.listaDeEspera.add(usuario);
    }
    public int getCantidadInscriptos(){
        return this.inscriptos.size();
    }

    public void setState(ExcursionState state){
        this.state = state;
    }

    public String getMailsInscriptos(){
        String mails = "Mails de los usuarios inscriptos: ";
        for (Usuario usuario : inscriptos){
            mails += usuario.getEmail() + " ";
        }
        return mails;
    }

    public void inscribirUsuario(Usuario usuario){
        this.state.inscribirUsuario(this, usuario);
    }

    public void llevarACabo(){
        this.state.llevarACabo(this);
    }

    public String mostrarInfo(){
        return this.state.mostrarInfo(this);
    }

    public String mostrarListaEspera(){
        String mails = "Mails de los usuarios en lista de espera: ";
        for (Usuario usuario : listaDeEspera){
            mails += usuario.getEmail() + " ";
        }
        return mails;
    }
}
