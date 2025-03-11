package financiera.presentacion;

import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import  financiera.negocio.FactoriaSA;
import  financiera.negocio.SAClientes;
import  financiera.presentacion.Controlador;
import  financiera.presentacion.Eventos;
import  financiera.presentacion.CUs.GUIMenuCUs;
import  financiera.presentacion.CUs.GUIMenuCUsImp;

public class ControladorImp extends Controlador {

	public void accion(int evento, Object datos) {
		switch (evento) {
		
		case (Eventos.VOLVER_MENU): {
			GUIMenuCUsImp menu = (GUIMenuCUsImp) GUIMenuCUs.getInstancia();
			JFrame menuFrame = menu.getFrame();
			menuFrame.setVisible(true);
		}
		
		case(Eventos.AÑADIR_CUENTA):{
			break;
		}

		default: {
			// GUIClientes.getInstancia().actualizar(Eventos.CLIENTES_LIMPIAR, null);
			break;
		}
		}
	}

}
