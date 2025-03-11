package seguridad.presentacion.CUs;

public abstract class GUIVerificarAcceso {
	static GUIVerificarAcceso instancia= null;
	
	public static GUIVerificarAcceso getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIVerificarAccesoImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
