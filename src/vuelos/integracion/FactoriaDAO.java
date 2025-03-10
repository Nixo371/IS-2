package vuelos.integracion;

public abstract class FactoriaDAO {
	
	static FactoriaDAO instancia = null;
	
	static public FactoriaDAO getInstancia() {
		if (instancia == null) {
			instancia = new FactoriaDAOImp();
		}
		
		return (instancia);
	}
	
	public abstract DAOClientes nuevoDAOClientes();

}
