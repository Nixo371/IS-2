package estacionamiento.presentacion;

public abstract class GUIModificarPlaza {

	static GUIModificarPlaza instancia= null;
	
	public static GUIModificarPlaza getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIModificarPlazaImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
