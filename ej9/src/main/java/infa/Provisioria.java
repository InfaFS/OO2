package infa;

import javax.management.RuntimeErrorException;

public class Provisioria extends ExcursionState {
    
    public void inscribirUsuario(Excursion contexto, Usuario usuario) {
        if (contexto.getCantidadInscriptos() < contexto.getCupoMin()){
            contexto.addUsuarioExcursion(usuario);}
        if (contexto.getCantidadInscriptos() == contexto.getCupoMin()){
            contexto.setState(new Definitiva());
        }
    }

        
    public void llevarACabo(Excursion context){
        throw new RuntimeErrorException(null, "No se puede llevar a cabi una excursion que no esta en estado definitivo");
    }

    public String mostrarInfo(Excursion context){
        return "Estado de excursion:Provisoria " + "Nombre de la excursion " + context.getNombre() + " Fecha de inicio: " + context.getFechaInicio() + " Fecha de fin: " + context.getFechaFin() + " Punto de encuentro: " + context.getPuntoDeEncuentro() +" Cantidad de cupos faltantes para el cupo minimo: " + (context.getCupoMin() - context.getCantidadInscriptos()) + "\n";
    }
    
}
