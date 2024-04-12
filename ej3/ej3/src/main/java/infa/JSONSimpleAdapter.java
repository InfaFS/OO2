package infa;

public class JSONSimpleAdapter extends VoorheesExporter {
	
	private JSONSimpleAdaptee jsonExporter;
	
	public JSONSimpleAdapter() {
		this.jsonExporter = new JSONSimpleAdaptee();
	}
	
	public String exportar(Socio socio) {
		return this.jsonExporter.exportar(socio);
	}

}