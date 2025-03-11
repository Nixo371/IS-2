package seguridad.presentacion.CUs;

public abstract class GUICrearAcceso {
	static GUICrearAcceso instancia= null;
	
	public static GUICrearAcceso getInstancia()	{
		if (instancia == null) 
			   instancia= new GUICrearAccesoImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
