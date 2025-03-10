package vuelos.negocio;

public class FactoriaSAImp extends FactoriaSA {
	
	public SAClientes nuevoSAClientes() {
		return new SAClientesImp();
	}

}
