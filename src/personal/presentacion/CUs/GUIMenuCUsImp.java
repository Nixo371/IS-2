package personal.presentacion.CUs;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import personal.presentacion.Controlador;
import personal.presentacion.Eventos;

public class GUIMenuCUsImp extends GUIMenuCUs {

		JFrame marco;
		
		public GUIMenuCUsImp()	{
			marco = new JFrame();
			
			JPanel panel = new JPanel();
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			panel.setPreferredSize(new Dimension(500, 250));
			
			JLabel title = new JLabel("Menu");
			title.setFont(new Font("Dialog", Font.PLAIN, 24));
			title.setAlignmentX(Component.CENTER_ALIGNMENT);
			
			panel.add(title);
			
			JPanel buttonsPanel= new JPanel();
			buttonsPanel.setLayout(new GridLayout(3, 3, 10, 10));
			buttonsPanel.setPreferredSize(new Dimension(500, 250));
			
			JButton AsignacionButton = new JButton("Asignar Rol/Turno/Función");
			JButton MostrarListaButton = new JButton("Mostrar Lista Empleados");
			JButton CrearNominaButton = new JButton("Crear Nómina");
			JButton AnadirEliminarEmpleadosButton = new JButton("Añadir/Eliminar Empleados");
			JButton GenerarInformeButton = new JButton("Generar Informe");

			buttonsPanel.add(AsignacionButton);
			buttonsPanel.add(MostrarListaButton);
			buttonsPanel.add(CrearNominaButton);
			buttonsPanel.add(AnadirEliminarEmpleadosButton);
			buttonsPanel.add(GenerarInformeButton);
		
			panel.add(buttonsPanel);
			
			marco.getContentPane().add(panel);
			marco.setTitle("Menu");
			marco.pack();
			
						
			AsignacionButton.addActionListener(new ActionListener()	{ 
				public void actionPerformed(ActionEvent e){
					marco.setVisible(false);
					Controlador.getInstancia().accion(Eventos.ASIGNACION, null);
				}
			});
			
			MostrarListaButton.addActionListener(new ActionListener()	{ 
				public void actionPerformed(ActionEvent e){
					marco.setVisible(false);
					Controlador.getInstancia().accion(Eventos.MOSTRARLISTA, null);
				}
			});

			CrearNominaButton.addActionListener(new ActionListener()	{ 
				public void actionPerformed(ActionEvent e){
					marco.setVisible(false);
					Controlador.getInstancia().accion(Eventos.CREARNOMINA, null);
				}
			});
			
			AnadirEliminarEmpleadosButton.addActionListener(new ActionListener()	{ 
				public void actionPerformed(ActionEvent e){
					marco.setVisible(false);
					Controlador.getInstancia().accion(Eventos.ANADIRELIMINAR, null);
				}
			});
			
			GenerarInformeButton.addActionListener(new ActionListener()	{ 
				public void actionPerformed(ActionEvent e){
					marco.setVisible(false);
					Controlador.getInstancia().accion(Eventos.GENERARINFORME, null);
					
				}
			});
			
			marco.setVisible(true);
		}
		
		
		public void actualizar(int evento, Object datos) {};
		
		public JFrame getFrame() {
			return marco;
		}
		
}
