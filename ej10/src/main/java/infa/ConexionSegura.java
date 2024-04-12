package infa;

public class ConexionSegura extends Conexion {
    private Encriptador encriptador;

    public ConexionSegura(Encriptador encriptador){
        this.encriptador = encriptador;
    }
    @Override
    public void enviarMensaje(String mensaje){
        String mensajeEncriptado = this.encriptador.encriptar(mensaje);
        super.enviarMensaje(mensajeEncriptado);
    }

    public void setEncriptador(Encriptador encriptador){
        this.encriptador = encriptador;
    }
}
