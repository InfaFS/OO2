package infa;

public class Definitiva extends ExcursionState {
    
    public void inscribirUsuario(Excursion contexto, Usuario usuario) {
        if (contexto.getCantidadInscriptos() < contexto.getCupoMax()){
            contexto.addUsuarioExcursion(usuario);}
        if (contexto.getCantidadInscriptos() == contexto.getCupoMax()){
            llevarACabo(contexto);
        }
    }

    public void llevarACabo(Excursion context){
        context.setState(new Cerrada());
    }

    public String mostrarInfo(Excursion context){
        return "Estado de excursion:Definitiva " + "Nombre de la excursion " + context.getNombre() + " Costo de la excursion: " + context.getCosto() + " Fecha de inicio: " + context.getFechaInicio() + " Fecha de fin: " + context.getFechaFin() + " Punto de encuentro: " + context.getPuntoDeEncuentro() +" Cantidad de cupos faltantes para el cupo maximo: " + (context.getCupoMax() - context.getCantidadInscriptos()) + context.getMailsInscriptos() + "\n" ;
    }

}
