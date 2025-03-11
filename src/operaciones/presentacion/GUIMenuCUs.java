package operaciones.presentacion;
import operaciones.presentacion.GUIMenuCUsImp;

public abstract class GUIMenuCUs {

	static GUIMenuCUs instancia= null;
	
	public static GUIMenuCUs getInstancia()	{
		if (instancia == null) 
			   instancia = new GUIMenuCUsImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}