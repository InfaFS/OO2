package infa;



public abstract class ExcursionState {
    public abstract void inscribirUsuario(Excursion contexto,Usuario usuario);
    public abstract void llevarACabo(Excursion contexto);
    public abstract String mostrarInfo(Excursion contexto);
}
