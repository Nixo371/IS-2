package global.integracion;

import global.integracion.FactoriaDAO;

public class FactoriaDAOImp extends FactoriaDAO {

public DAOClientes nuevoDAOClientes()	{
		return new DAOClientesImp();
	}

}
