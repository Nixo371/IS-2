package integracion.vuelos;

public abstract class FactoriaDAO {
	
	static FactoriaDAO instancia = null;
	
	static public FactoriaDAO getInstancia() {
		if (instancia == null) {
			instancia = new FactoriaDAOImp();
		}
		
		return (instancia);
	}

	public abstract DAOAvion nuevoDAOAvion();
	public abstract DAOVuelo nuevoDAOVuelo();

}
