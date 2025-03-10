package seguridad.presentacion;

import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JOptionPane;

import seguridad.negocio.FactoriaSA;
import seguridad.negocio.SAClientes;
import seguridad.presentacion.Controlador;
import seguridad.presentacion.Eventos;

public class ControladorImp extends Controlador {
	
	
	public void accion(int evento, Object datos)	{
		switch (evento){
		case (Eventos.CLIENTES_SUMAR): 
		{
			HashMap<String, String> ids= (HashMap<String, String>) datos;
			Float id1= new Float(ids.get("id1"));
			Float id2= new Float(ids.get("id2"));
			
			//creamos el servicio de aplicaci�n de la capa de negocio
			SAClientes saClientes=  FactoriaSA.getInstancia().nuevoSAClientes();
			//delego la tarea en el SA de capa de negocio (en este caso sumar)
			Float resultado= saClientes.sumar(id1, id2);
			
			if (resultado ==-1) 
				JOptionPane.showMessageDialog(null, "No se encontr� a alg�n empleado");
			else 
				JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
			
			GUIClientes.getInstancia().actualizar(Eventos.CLIENTES_LIMPIAR, null);
			break;
						}
		case (Eventos.CAMPOS_VACIOS): {
			
			JOptionPane.showMessageDialog(null, "Alg�n campo est� vacio");
			GUIClientes.getInstancia().actualizar(Eventos.CLIENTES_LIMPIAR, null);
			
		}
		default: { GUIClientes.getInstancia().actualizar(Eventos.CLIENTES_LIMPIAR, null); break; }
		}
	}
	

}
