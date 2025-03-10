package equipaje.negocio;

import equipaje.negocio.FactoriaSA;

public class FactoriaSAImp extends FactoriaSA {
	
	public SAClientes nuevoSAClientes()
	{
		return new SAClientesImp();
	}

}
