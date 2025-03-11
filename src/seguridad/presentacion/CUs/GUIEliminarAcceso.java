package seguridad.presentacion.CUs;

public abstract class GUIEliminarAcceso {
	static GUIEliminarAcceso instancia= null;
	
	public static GUIEliminarAcceso getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIEliminarAccesoImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
