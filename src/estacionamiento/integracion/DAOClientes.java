package estacionamiento.integracion;

import estacionamiento.negocio.TransferCliente;

public interface DAOClientes {
	
	public TransferCliente buscaCliente(float idCliente);

}
