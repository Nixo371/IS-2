package paneles.presentacion.CUs;

public abstract class GUIMostrarDatos {

	static GUIMostrarDatos instancia= null;
	
	public static GUIMostrarDatos getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIMostrarDatosImp();
		return instancia;
	}

	public abstract void actualizar(int evento, Object datos);
}
