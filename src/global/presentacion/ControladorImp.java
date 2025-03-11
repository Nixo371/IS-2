package global.presentacion;

import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import global.negocio.FactoriaSA;
import global.negocio.SAClientes;
import global.presentacion.Controlador;
import global.presentacion.Eventos;

public class ControladorImp extends Controlador {
	
	
	public void accion(int evento, Object datos)	{
		switch (evento) {
		case (Eventos.SUB_PANELES): {
			JFrame marco = (JFrame) datos;
			
			marco.setVisible(false);
            paneles.presentacion.CUs.GUIMenuCUsImp menu = (paneles.presentacion.CUs.GUIMenuCUsImp) paneles.presentacion.CUs.GUIMenuCUs.getInstancia();
			JFrame menuFrame = menu.getFrame();
			menuFrame.setVisible(true);
			break;
		}

		case (Eventos.SUB_PERSONAL): {
			JFrame marco = (JFrame) datos;
			
			marco.setVisible(false);
            personal.presentacion.CUs.GUIMenuCUsImp menu = (personal.presentacion.CUs.GUIMenuCUsImp) personal.presentacion.CUs.GUIMenuCUs.getInstancia();
			JFrame menuFrame = menu.getFrame();
			menuFrame.setVisible(true);
			break;
		}

		case (Eventos.SUB_EQUIPAJE): {
			JOptionPane.showMessageDialog(null, "Aun no esta implementado!");
//			JFrame marco = (JFrame) datos;
//			
//			marco.setVisible(false);
//            equipaje.presentacion.GUIMenuCUsImp menu = (equipaje.presentacion.GUIMenuCUsImp) equipaje.presentacion.GUIMenuCUs.getInstancia();
//			JFrame menuFrame = menu.getFrame();
//			menuFrame.setVisible(true);
			break;
		}

		case (Eventos.SUB_OPERACIONES): {
			JFrame marco = (JFrame) datos;
			
			marco.setVisible(false);
            operaciones.presentacion.GUIMenuCUsImp menu = (operaciones.presentacion.GUIMenuCUsImp) operaciones.presentacion.GUIMenuCUs.getInstancia();
			JFrame menuFrame = menu.getFrame();
			menuFrame.setVisible(true);
			break;
		}

		case (Eventos.SUB_FINANCIERA): {
			JFrame marco = (JFrame) datos;
			
			marco.setVisible(false);
            financiera.presentacion.CUs.GUIMenuCUsImp menu = (financiera.presentacion.CUs.GUIMenuCUsImp) financiera.presentacion.CUs.GUIMenuCUs.getInstancia();
			JFrame menuFrame = menu.getFrame();
			menuFrame.setVisible(true);
			break;
		}

		case (Eventos.SUB_INCIDENCIAS): {
			JFrame marco = (JFrame) datos;
			
			marco.setVisible(false);
            incidencias.presentacion.CUs.GUIMenuCUsImp menu = (incidencias.presentacion.CUs.GUIMenuCUsImp) incidencias.presentacion.CUs.GUIMenuCUs.getInstancia();
			JFrame menuFrame = menu.getFrame();
			menuFrame.setVisible(true);
			break;
		}

		case (Eventos.SUB_LOCALES): {
			JFrame marco = (JFrame) datos;
			
			marco.setVisible(false);
            locales.presentacion.CUs.GUIMenuCUsImp menu = (locales.presentacion.CUs.GUIMenuCUsImp) locales.presentacion.CUs.GUIMenuCUs.getInstancia();
			JFrame menuFrame = menu.getFrame();
			menuFrame.setVisible(true);
			break;
		}

		case (Eventos.SUB_ESTACIONAMIENTO): {
			JFrame marco = (JFrame) datos;
			
			marco.setVisible(false);
            estacionamiento.presentacion.GUIMenuCUsImp menu = (estacionamiento.presentacion.GUIMenuCUsImp) estacionamiento.presentacion.GUIMenuCUs.getInstancia();
			JFrame menuFrame = menu.getFrame();
			menuFrame.setVisible(true);
			break;
		}

		case (Eventos.SUB_VUELOS): {
			JFrame marco = (JFrame) datos;
			
			marco.setVisible(false);
            vuelos.presentacion.GUIMenuCUsImp menu = (vuelos.presentacion.GUIMenuCUsImp) vuelos.presentacion.GUIMenuCUs.getInstancia();
			JFrame menuFrame = menu.getFrame();
			menuFrame.setVisible(true);
			break;
		}

		case (Eventos.SUB_SEGURIDAD): {
			JOptionPane.showMessageDialog(null, "Aun no esta implementado!");
//			JFrame marco = (JFrame) datos;
//			
//			marco.setVisible(false);
//            seguridad.presentacion.GUIMenuCUsImp menu = (seguridad.presentacion.GUIMenuCUsImp) seguridad.presentacion.GUIMenuCUs.getInstancia();
//			JFrame menuFrame = menu.getFrame();
//			menuFrame.setVisible(true);
			break;
		}

			default: {
				GUIClientes.getInstancia().actualizar(Eventos.CLIENTES_LIMPIAR, null); break;
			}
		}
	}
	

}
