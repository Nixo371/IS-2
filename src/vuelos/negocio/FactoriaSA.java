package vuelos.negocio;

public abstract class FactoriaSA {
	
	static FactoriaSA instancia = null;
	
	static public FactoriaSA getInstancia()	{
		if (instancia == null) {
			instancia = new FactoriaSAImp();
		}
		
		return (instancia);
	}
	
	abstract public SAClientes nuevoSAClientes();

}
