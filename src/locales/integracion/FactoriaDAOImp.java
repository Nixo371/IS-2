package locales.integracion;

import locales.integracion.FactoriaDAO;

public class FactoriaDAOImp extends FactoriaDAO {

public DAOClientes nuevoDAOClientes()	{
		return new DAOClientesImp();
	}

}
