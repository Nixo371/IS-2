package estacionamiento.presentacion;

public abstract class GUICrearPlaza {

	static GUICrearPlaza instancia= null;
	
	public static GUICrearPlaza getInstancia()	{
		if (instancia == null) 
			   instancia= new GUICrearPlazaImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
