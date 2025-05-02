package integracion.vuelos;

public class FactoriaDAOImp extends FactoriaDAO {

	@Override
	public DAOAvion nuevoDAOAvion() {
		return (new DAOAvionImp());
	}

	@Override
	public DAOVuelo nuevoDAOVuelo() {
		return (new DAOVueloImp());
	}
}
