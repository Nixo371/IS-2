package locales.presentacion;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import locales.presentacion.CUs.GUIMenuCUs;
import locales.presentacion.CUs.GUIMenuCUsImp;

public class ControladorImp extends Controlador {
	
	public void accion(int evento, Object datos) {
		
		switch(evento) {
		
		case (Eventos.ACEPTAR_CAMBIOS):{
			JOptionPane.showMessageDialog(null, "Se aceptarían los cambios");
			break;
		}
		
		case (Eventos.CANCELAR_CAMBIOS):{
			JOptionPane.showMessageDialog(null, "Se cancelarían los cambios");
			break;
		}
		
		case (Eventos.AÑADIR_LOCALES):{
			break;
		}
		
		case (Eventos.ELIMINAR_LOCALES):{
			break;
		}
		
		case (Eventos.FILTRAR_LOCALES):{
			break;
		}
		
		case (Eventos.MODIFICAR_LOCALES):{
			break; 
		}
		
		case (Eventos.MOSTRAR_LOCALES):{
			break;
		}
		

		case (Eventos.VOLVER_MENU):{
			GUIMenuCUsImp menu = (GUIMenuCUsImp) GUIMenuCUs.getInstancia();
			JFrame menuFrame = menu.getFrame();
			menuFrame.setVisible(true);
			break;
		}
		
		
		
		}
	}
	
	
}
