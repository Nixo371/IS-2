package operaciones.integracion;

import operaciones.integracion.FactoriaDAO;

public class FactoriaDAOImp extends FactoriaDAO {

public DAOClientes nuevoDAOClientes()	{
		return new DAOClientesImp();
	}

}
