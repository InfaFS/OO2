package infa;

import javax.management.RuntimeErrorException;

public class Cerrada extends ExcursionState{
    public void inscribirUsuario(Excursion contexto, Usuario usuario) {
        contexto.addUsuarioListaEspera(usuario);
    }

    public void llevarACabo(Excursion context){
        System.out.println("Iniciando excursion... Buena suerte!");
    }

    public String mostrarInfo(Excursion context){
        return "Estado de excursion:Cerrada " + "Nombre de la excursion " + context.getNombre() + " Costo de la excursion: " + context.getCosto() + " Fecha de inicio: " + context.getFechaInicio() + " Fecha de fin: " + context.getFechaFin() + " Punto de encuentro: " + context.getPuntoDeEncuentro() + "\n" ;
    }
}
