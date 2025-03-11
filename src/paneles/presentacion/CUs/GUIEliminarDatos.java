package paneles.presentacion.CUs;

public abstract class GUIEliminarDatos {

	static GUIEliminarDatos instancia= null;
	
	public static GUIEliminarDatos getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIEliminarDatosImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
