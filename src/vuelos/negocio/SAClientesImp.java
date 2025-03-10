package vuelos.negocio;

import vuelos.integracion.DAOClientes;
import vuelos.integracion.FactoriaDAO;

public class SAClientesImp implements SAClientes{
	
	public Float sumar(Float id1, Float id2) {
		float suma = -1;
		
		// El SA necesita los datos de los clientes con un determinado id
		// para ello crea un DAO que se va a encargar de buscarlo en la base de datos
		// y devolverlo en un transfer
		DAOClientes daoCliente = FactoriaDAO.getInstancia().nuevoDAOClientes();
		
		TransferCliente transferCliente1 = daoCliente.buscaCliente(id1);
	    TransferCliente transferCliente2 = daoCliente.buscaCliente(id2);
	    
		if (transferCliente1 != null && transferCliente2 != null) {
			suma = transferCliente1.getSalario() + transferCliente2.getSalario();
		}
		return suma;
	}

}
