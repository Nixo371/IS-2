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
		case(Eventos.ACEPTAR_CAMBIOS):{
			break;
		}
		case(Eventos.CANCELAR_CAMBIOS):{
			break;
		}
		case(Eventos.CREAR_ACCESO):{
			break;
		}
		case(Eventos.VOLVER_MENU):{
			break;
		}
		case(Eventos.ELIMINAR_ACCESO):{
			break;
		}
		case(Eventos.MODIFICAR_ACCESO):{
			break;
		}
		case(Eventos.VERIFICAR_ACCESO):{
			break;
		}
		case(Eventos.ACTIVAR_DISPOSITIVO):{
			break;
		}
		case(Eventos.DESACTIVAR_DISPOSITIVO):{
			break;
		}
		case(Eventos.CONFIGURAR_DISPOSITIVO):{
			break;
		}
		case(Eventos.CONSULTAR_HISTORIAL):{
			break;
		}
			
		}

	}
	

}
