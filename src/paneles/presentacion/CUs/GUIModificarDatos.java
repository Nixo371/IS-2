package paneles.presentacion.CUs;

public abstract class GUIModificarDatos {

	static GUIModificarDatos instancia= null;
	
	public static GUIModificarDatos getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIModificarDatosImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
