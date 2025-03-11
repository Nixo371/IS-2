package paneles.presentacion.CUs;

public abstract class GUIAñadirDatos {

	static GUIAñadirDatos instancia= null;
	
	public static GUIAñadirDatos getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIAñadirDatosImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
