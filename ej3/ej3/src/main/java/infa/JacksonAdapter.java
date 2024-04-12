package infa;

public class JacksonAdapter extends VoorheesExporter {
    private JacksonAdaptee jacksonAdapter;

    public JacksonAdapter(){
        jacksonAdapter = new JacksonAdaptee();
    }

    public String exportar (Socio socio){
        return jacksonAdapter.exportar(socio);
    }
}
