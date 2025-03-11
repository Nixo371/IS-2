package incidencias.presentacion.CUs;

public abstract class GUICrearIncidencia {

	static GUICrearIncidencia instancia = null;

	public static GUICrearIncidencia getInstancia() {
		if (instancia == null)
			instancia = new GUICrearIncidenciaImp();  //
		return instancia;
	}

	public abstract void actualizar(int evento, Object datos);
}
