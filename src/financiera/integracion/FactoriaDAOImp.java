package financiera.integracion;

import financiera.integracion.FactoriaDAO;

public class FactoriaDAOImp extends FactoriaDAO {

public DAOClientes nuevoDAOClientes()	{
		return new DAOClientesImp();
	}

}
