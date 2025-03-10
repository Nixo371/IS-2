package personal.negocio;

import personal.negocio.FactoriaSA;

public class FactoriaSAImp extends FactoriaSA {
	
	public SAClientes nuevoSAClientes()
	{
		return new SAClientesImp();
	}

}
