package seguridad.presentacion.CUs;

public abstract class GUIModificarAcceso {
	static GUIModificarAcceso instancia= null;
	
	public static GUIModificarAcceso getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIModificarAccesoImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
