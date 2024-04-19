package infa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class DatabaseRealAccessProxy implements DatabaseAccess {
    private String password;
    private DatabaseRealAccess databaseRealAccess;
    private boolean authenticated;
    public DatabaseRealAccessProxy(DatabaseRealAccess databaseRealAccess, String password) {
        this.databaseRealAccess = databaseRealAccess;
        this.password=password;
        this.authenticated=false;
    }


    public int insertNewRow(List<String> rowData) {
        if (this.authenticated) {
            return this.databaseRealAccess.insertNewRow(rowData);
        } else {
            System.out.println("Acceso denegado, autentiquese");
            this.authenticate();
            return this.databaseRealAccess.insertNewRow(rowData);
           // throw new RuntimeException("Acceso denegado, autentiquese");
        }
    }

    public Collection<String> getSearchResults(String queryString) {
        if (this.authenticated) {
            return this.databaseRealAccess.getSearchResults(queryString);
        } else {
            System.out.println("Acceso denegado, autentiquese");
            this.authenticate();
           return this.databaseRealAccess.getSearchResults(queryString);
            
        }
    
    }


    private void authenticate() {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
  
        if (this.password.equals(pass)) {
            this.authenticated = true;
        } else {
            System.out.println("Contrasenia invalida, intente nuevamente");
            this.authenticate();
        }
        scanner.close();
    }


}
