package vuelos.integracion;

public class FactoriaDAOImp extends FactoriaDAO {
public DAOClientes nuevoDAOClientes() {
		return (new DAOClientesImp());
	}
}
