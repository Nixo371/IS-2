package paneles.presentacion.CUs;

public abstract class GUIMostrarAviso {

	static GUIMostrarAviso instancia= null;
	
	public static GUIMostrarAviso getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIMostrarAvisoImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
