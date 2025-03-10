package locales.presentacion;
import locales.presentacion.GUIClientesImp;

public abstract class GUIClientes {

	static GUIClientes instancia= null;
	
	public static GUIClientes getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIClientesImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
