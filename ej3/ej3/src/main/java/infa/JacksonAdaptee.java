package infa;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.core.JsonProcessingException;

public class JacksonAdaptee {
    private ObjectMapper mapper;

    public JacksonAdaptee() {
        this.mapper = new ObjectMapper();       
    }

    public String exportar(Socio socio){
        try {
            return mapper.writeValueAsString(socio);
        } catch (JsonProcessingException e) {
            // Manejo de la excepción
            e.printStackTrace(); // O cualquier otra acción que desees realizar
            return null; // O devuelve un valor predeterminado en caso de error
        }
    } 
}
