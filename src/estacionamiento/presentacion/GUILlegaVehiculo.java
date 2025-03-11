package estacionamiento.presentacion;

public abstract class GUILlegaVehiculo {

	static GUILlegaVehiculo instancia= null;
	
	public static GUILlegaVehiculo getInstancia()	{
		if (instancia == null) 
			   instancia= new GUILlegaVehiculoImp();
		return instancia;
	}
	
	public abstract void actualizar(int evento, Object datos);
}
