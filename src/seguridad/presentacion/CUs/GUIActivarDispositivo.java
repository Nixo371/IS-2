package seguridad.presentacion.CUs;

public abstract class GUIActivarDispositivo {
	static GUIActivarDispositivo instancia= null;
	
	public static GUIActivarDispositivo getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIActivarDispositivoImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
