package estacionamiento.presentacion;

public abstract class GUIEliminarPlaza {

	static GUIEliminarPlaza instancia= null;
	
	public static GUIEliminarPlaza getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIEliminarPlazaImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
