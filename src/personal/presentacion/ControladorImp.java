package personal.presentacion;

import javax.swing.JOptionPane;

public class ControladorImp extends Controlador {
	public void accion(int evento, Object datos)	{
		switch (evento){
		case Eventos.ASIGNACION: 
			JOptionPane.showMessageDialog(null, "Se pueden asignar rol, turnos y funciones a los empleados");
			break;
		case Eventos.MOSTRARLISTA: 
			JOptionPane.showMessageDialog(null, "Se muestra la lista de empleados");
			break;
		case Eventos.CREARNOMINA: 
			JOptionPane.showMessageDialog(null, "Se puede crear la nomina de los empleados");
			break;
		case Eventos.ANADIRELIMINAR: 
			JOptionPane.showMessageDialog(null, "Se pueden añadir o eliminar a empleados");
			break;
		case Eventos.GENERARINFORME: 
			JOptionPane.showMessageDialog(null, "Se puede generar informes");
			break;
		}
	}
}