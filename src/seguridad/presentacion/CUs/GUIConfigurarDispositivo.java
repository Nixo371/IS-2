package seguridad.presentacion.CUs;

public abstract class GUIConfigurarDispositivo {
	static GUIConfigurarDispositivo instancia= null;
	
	public static GUIConfigurarDispositivo getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIConfigurarDispositivoImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
