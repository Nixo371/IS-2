package financiera.presentacion.CUs;

public abstract class GUIContabilidad {
	
	static GUIContabilidad instancia= null;
	
	public static GUIContabilidad getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIContabilidadImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);

}
