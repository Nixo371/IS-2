package locales.presentacion.CUs;

public abstract class GUIEliminarLocales {

	static GUIEliminarLocales instancia= null;
	
	public static GUIEliminarLocales getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIEliminarLocalesImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
