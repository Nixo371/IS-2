package incidencias.presentacion;

import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import incidencias.negocio.FactoriaSA;
import incidencias.negocio.SAClientes;
import incidencias.presentacion.Controlador;
import incidencias.presentacion.Eventos;
import incidencias.presentacion.CUs.GUIMenuCUs;
import incidencias.presentacion.CUs.GUIMenuCUsImp;

public class ControladorImp extends Controlador {

	public void accion(int evento, Object datos) {
		switch (evento) {
		case(Eventos.VOLVER_MENU):
		{
			GUIMenuCUsImp menu = (GUIMenuCUsImp) GUIMenuCUs.getInstancia();
			JFrame menuFrame = menu.getFrame();
			menuFrame.setVisible(true);
		}
//		default: {
//			GUIClientes.getInstancia().actualizar(Eventos.CLIENTES_LIMPIAR, null);
//			break;
//		}
		}
	}

}
