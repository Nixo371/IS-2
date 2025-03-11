package seguridad.presentacion.CUs;

public abstract class GUIConsultarHistorial {
	static GUIConsultarHistorial instancia= null;
	
	public static GUIConsultarHistorial getInstancia()	{
		if (instancia == null) 
			   instancia= new GUIConsultarHistorialImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
