package locales.presentacion.CUs;

public abstract class GUIModificarLocales {

	static GUIModificarLocales instancia= null;
	
	public static GUIModificarLocales getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIModificarLocalesImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
