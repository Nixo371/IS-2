package estacionamiento.negocio;

import estacionamiento.negocio.FactoriaSA;

public class FactoriaSAImp extends FactoriaSA {
	
	public SAClientes nuevoSAClientes()
	{
		return new SAClientesImp();
	}

}
