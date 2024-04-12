package infa;
import java.util.*;
//import java.util.stream.*;
//hacer superclase de tweet y rt
//eliminar recursivamente
public class Twitter {

    private ArrayList<Usuario> usuarios;

    public Twitter(){
        this.usuarios=new ArrayList<Usuario>();

    }
    //agrega un usuario a la lista de usuarios
    public Usuario agregarUsuario(Usuario usuario ){
        String screenName = usuario.getScreenName();
        if (!match(screenName)){
        this.usuarios.add(usuario);
       }
       return null;
    }
    //busca un match en la lista de usuarios con el nombre ingresado
    private boolean match(String screenName){
        return this.usuarios.stream().
        anyMatch((u) -> u.getScreenName().equals(screenName));
    }

    //obtiene lista de usuarios
    public List<Usuario> getUsuarios(){
        return this.usuarios;
    }

    public void eliminarUsuario(Usuario usuario) {
        usuario.getPosteos().stream()
                .filter(posteo -> posteo.getOrigen() == null)
                .forEach(posteo -> usuarios.forEach(user -> eliminarPosteosRelacionados(user, posteo)));
    
        usuario.eliminarPosteos();
        usuarios.remove(usuario);
    }
    

  private void eliminarPosteosRelacionados(Usuario usuario, Posteo posteo) {
    usuario.getPosteos().stream()
            .filter(p -> p.getOrigen() != null)
            .forEach(p -> eliminarPosteosRelacionadosRecursivo(p, posteo, usuario));}

    
    private boolean eliminarPosteosRelacionadosRecursivo(Posteo posteoAnalizar,Posteo posteo,Usuario user){
        boolean exito = false;
        if(posteoAnalizar.getOrigen() == null){
            if (posteoAnalizar.equals(posteo)){
                return true;
            }
            return false;
        }

       // exito =// 
       exito = eliminarPosteosRelacionadosRecursivo(posteoAnalizar.getOrigen(), posteo,user);
      if(exito){
       user.eliminarPosteo(posteoAnalizar);
       }
       //if (exito){
       //user.eliminarPosteo(posteoAnalizar);
       // }
        return exito;
       
    }
    
}

