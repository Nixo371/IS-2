package paneles.presentacion;

import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import paneles.negocio.FactoriaSA;
import paneles.negocio.SAClientes;
import paneles.presentacion.Controlador;
import paneles.presentacion.Eventos;
import paneles.presentacion.CUs.GUIAñadirDatos;
import paneles.presentacion.CUs.GUIMenuCUs;
import paneles.presentacion.CUs.GUIMenuCUsImp;

public class ControladorImp extends Controlador {
	
	
	public void accion(int evento, Object datos) {
		
		switch (evento) {
		
		case (Eventos.ACEPTAR_CAMBIOS): {
			JOptionPane.showMessageDialog(null, "Se aceptarían los cambios");
			break;
		}
		
		case (Eventos.CANCELAR_CAMBIOS): {
			JOptionPane.showMessageDialog(null, "Se cancelarían los cambios");
			break;
		}
		
		
		case (Eventos.AÑADIR_DATOS): {
			break;
		}
		
		case (Eventos.ELIMINAR_DATOS): {
			break;
		}
		
		case (Eventos.MODIFICAR_DATOS): {
			break;
		}
		
		case (Eventos.MOSTRAR_DATOS): {
			break;
		}
		
		case (Eventos.FILTRAR_DATOS): {
			break;
		}
		
		case (Eventos.AÑADIR_PANEL): {
			break;
		}
		
		case (Eventos.ELIMINAR_PANEL): {
			break;
		}
		
		case (Eventos.MOSTRAR_AVISO): {
			break;
		}
		
		
		case (Eventos.VOLVER_MENU): {
			GUIMenuCUsImp menu = (GUIMenuCUsImp) GUIMenuCUs.getInstancia();
			JFrame menuFrame = menu.getFrame();
			menuFrame.setVisible(true);
			break;
		}
		
		case (Eventos.CLIENTES_SUMAR): {
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
			
			GUIAñadirDatos.getInstancia().actualizar(Eventos.CLIENTES_LIMPIAR, null);
			break;
						}
		case (Eventos.CAMPOS_VACIOS): {
			
			JOptionPane.showMessageDialog(null, "Alg�n campo est� vacio");
			GUIAñadirDatos.getInstancia().actualizar(Eventos.CLIENTES_LIMPIAR, null);
			break;
			
		}
		default: { GUIAñadirDatos.getInstancia().actualizar(Eventos.CLIENTES_LIMPIAR, null); break; }
		}
	}
	

}
