package locales.negocio;

import locales.negocio.FactoriaSA;

public class FactoriaSAImp extends FactoriaSA {
	
	public SAClientes nuevoSAClientes()
	{
		return new SAClientesImp();
	}

}
