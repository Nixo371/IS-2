package locales.presentacion.CUs;

public abstract class GUIMostrarLocales {

	static GUIMostrarLocales instancia= null;
	
	public static GUIMostrarLocales getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIMostrarLocalesImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
