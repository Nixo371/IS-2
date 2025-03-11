package operaciones.presentacion;

import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JOptionPane;

import operaciones.negocio.FactoriaSA;
import operaciones.negocio.SAClientes;
import operaciones.presentacion.Controlador;
import operaciones.presentacion.Eventos;

public class ControladorImp extends Controlador {
	
	
	public void accion(int evento, Object datos)	{
		switch (evento){
		
		case Eventos.GESTION_MANUAL_ASIGNACIONES: 
			JOptionPane.showMessageDialog(null, "Se muestra un timeline de las asignaciones para poder gestionarla");
			break; 
		case Eventos.CONSULTAR_PUERTAS:
			JOptionPane.showMessageDialog(null, "Se muestran las puertas con su información y la opción a modificarlos");
			break;
		case Eventos.MODIFICAR_PUERTA:
			JOptionPane.showMessageDialog(null, "Se muestra la pantalla de modificar puerta");
			break;
		case Eventos.CREAR_PUERTA:
			JOptionPane.showMessageDialog(null, "Se muestra la pantalla de crear puerta");
			break;
		case Eventos.VER_PUERTA:
			JOptionPane.showMessageDialog(null, "Se muestra la puerta");
			break;
		case Eventos.ELIMINAR_PUERTA:
			JOptionPane.showMessageDialog(null, "Se elimina la puerta");
			break;
		case Eventos.EDITAR_PUERTA:
			JOptionPane.showMessageDialog(null, "Se muestra la pantalla de editar puerta");
			break;
		case Eventos.AÑADIR_BLOQUEO:
			JOptionPane.showMessageDialog(null, "Se añade el bloqueo a la puerta");
			break;
		case Eventos.ELIMINAR_BLOQUEO:
			JOptionPane.showMessageDialog(null, "Se elimina el bloqueo asociado a una puerta");
			break;
			
		}
	}
	

}
