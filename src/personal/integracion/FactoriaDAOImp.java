package personal.integracion;

import personal.integracion.FactoriaDAO;

public class FactoriaDAOImp extends FactoriaDAO {

public DAOClientes nuevoDAOClientes()	{
		return new DAOClientesImp();
	}

}
