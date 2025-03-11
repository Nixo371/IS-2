package seguridad.presentacion.CUs;

public abstract class GUIDesactivarDispositivo {
	static GUIDesactivarDispositivo instancia= null;
	
	public static GUIDesactivarDispositivo getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIDesactivarDispositivoImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
