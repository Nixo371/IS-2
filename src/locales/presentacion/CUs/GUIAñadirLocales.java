package locales.presentacion.CUs;

public abstract class GUIAñadirLocales {

	static GUIAñadirLocales instancia= null;
	
	public static GUIAñadirLocales getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIAñadirLocalesImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
