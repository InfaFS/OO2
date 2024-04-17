package infa;

import java.util.ArrayList;
import java.util.List;

public class DatabaseRealAccessProxy {
    private String password;
    private DatabaseRealAccess databaseRealAccess;
    public DatabaseRealAccessProxy(DatabaseRealAccess databaseRealAccess, String password) {
        this.databaseRealAccess = databaseRealAccess;
        this.password=password;
    }

    public int insertNewRow(List<String> rowData, String password) {
        if (authenticate(password)) {
            return this.databaseRealAccess.insertNewRow(rowData);
        } else {
            throw new RuntimeException("Acceso denegado");
        }
    }

    public String getSearchResults(String queryString, String password) {
        if (authenticate(password)) {
            return this.databaseRealAccess.getSearchResults(queryString).toString();
        } else {
            throw new RuntimeException("Acceso denegado");
        }
    }


    private boolean authenticate(String password) {
        return this.password.equals(password);
    }


}
