package vuelos.presentacion;

import javax.swing.*;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;


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
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new GridLayout(3, 3, 10, 10));
		buttonsPanel.setPreferredSize(new Dimension(500, 250));
		
		JButton CrearVueloButton = new JButton("Crear Vuelo");
		JButton ActualizarVueloButton = new JButton("Actualizar Vuelo");
		JButton EliminarVueloButton = new JButton("Eliminar Vuelo");
		JButton BuscarVueloButton = new JButton("Buscar Vuelo");
		JButton MostrarVueloButton = new JButton("Mostrar Vuelo");
		JButton MandarNotificacionButton = new JButton("Mandar Notificacion");
		
		buttonsPanel.add(CrearVueloButton);
		buttonsPanel.add(ActualizarVueloButton);
		buttonsPanel.add(EliminarVueloButton);
		buttonsPanel.add(BuscarVueloButton);
		buttonsPanel.add(MostrarVueloButton);
		buttonsPanel.add(MandarNotificacionButton);
		
		panel.add(buttonsPanel);
		
		marco.getContentPane().add(panel);
		marco.setTitle("Menu");
		marco.pack();
		
					
		CrearVueloButton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				ControladorImp.getInstancia().accion(Eventos.CREAR_VUELO, null);
			}
		});
		
		ActualizarVueloButton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				ControladorImp.getInstancia().accion(Eventos.ACTUALIZAR_VUELO, null);
			}
		});
		
		EliminarVueloButton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				ControladorImp.getInstancia().accion(Eventos.ELIMINAR_VUELO, null);
			}
		});
		
		BuscarVueloButton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				ControladorImp.getInstancia().accion(Eventos.BUSCAR_VUELO, null);
			}
		});
		
		MostrarVueloButton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				ControladorImp.getInstancia().accion(Eventos.MOSTRAR_VUELO, null);
			}
		});
		
		MandarNotificacionButton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				ControladorImp.getInstancia().accion(Eventos.MANDAR_NOTIFICACION, null);
			}
		});
		
		
		
		marco.setVisible(true);
	}
	
	
	//m�todo actualizar de la vista
	public void actualizar(int evento, Object datos) {
//		switch (evento)		{
//		case (Eventos.CLIENTES_LIMPIAR): { 
//			                               campo3.setText(null);
//										   campo4.setText(null);
//										   marco.setVisible(true);
//										  break;
//										 }
//		}
	};
	
	public JFrame getFrame() {
		return marco;
	}

}
