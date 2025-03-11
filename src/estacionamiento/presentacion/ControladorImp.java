
package estacionamiento.presentacion; // ControladorImp.java

import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.crypto.Data;


import estacionamiento.presentacion.Controlador;
import estacionamiento.presentacion.Eventos;


public class ControladorImp extends Controlador {
	
	public void accion(int evento, Object datos) {
		
		switch (evento) {
			
		case (Eventos.ACEPTAR_CAMBIOS): {
			JOptionPane.showMessageDialog(null, "Se aceptarían los cambios");
			break;
		}
		
		case (Eventos.CANCELAR_CAMBIOS): {
			JOptionPane.showMessageDialog(null, "Se cancelarán los cambios");
			break;
		}
		
		case (Eventos.CREAR_PLAZA): {
			break;
		}
		
		case (Eventos.ELIMINAR_PLAZA): {
			break;
		}
		
		case (Eventos.MODIFICAR_PLAZA): {
			break;
		}
		
		case (Eventos.LISTA_PLAZAS): {
			break;
		}
		
		case (Eventos.ABANDONA_VEHICULO): {
			break;
		}
		
		case (Eventos.LLEGA_VEHICULO): {
			break;
		}
		
		case (Eventos.MANTENIMIENTO_PLAZA): {
			break;
		}
		
		case (Eventos.VOLVER_MENU): {
			GUIMenuCUsImp menu = (GUIMenuCUsImp) GUIMenuCUs.getInstancia();
			JFrame menuFrame = menu.getFrame();
			menuFrame.setVisible(true);		}
		
		}
	}
}
