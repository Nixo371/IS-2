package vuelos.presentacion;

import javax.swing.JOptionPane;

public class ControladorImp extends Controlador {
	
	public void accion(int evento, Object datos) {
		switch (evento) {
			case Eventos.CREAR_VUELO: {
				JOptionPane.showMessageDialog(null, "Se crea un vuelo.");
				break;
			}
			case Eventos.ACTUALIZAR_VUELO: {
				JOptionPane.showMessageDialog(null, "Se actualiza un vuelo.");
				break;
			}
			case Eventos.ELIMINAR_VUELO: {
				JOptionPane.showMessageDialog(null, "Se elimina un vuelo.");
				break;
			}
			case Eventos.BUSCAR_VUELO: {
				JOptionPane.showMessageDialog(null, "Se busca un vuelo.");
				break;
			}
			case Eventos.MOSTRAR_VUELO: {
				JOptionPane.showMessageDialog(null, "Se muestra un vuelo.");
				break;
			}
			case Eventos.MANDAR_NOTIFICACION: {
				JOptionPane.showMessageDialog(null, "Se manda una notificacion al subsistema de Operaciones.");
				break;
			}
			default: {
			}
		}
	}
}
