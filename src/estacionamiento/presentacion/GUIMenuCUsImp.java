package estacionamiento.presentacion;

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
		
		JButton CrearPlazaButton = new JButton("Crear Nueva Plaza");
		JButton EliminarPlazaButton = new JButton("Eliminar Plaza");
		JButton ModificarPlazaButton = new JButton("Modificar Plaza");
		JButton ListaPlazasButton = new JButton("Lista Plazas");
		JButton AbandonaVehiculoButton = new JButton("Abandona Vehículo");
		JButton LlegaVehiculoButton = new JButton("Llega Vehículo");
		JButton MantenimientoPlazaButton = new JButton("Mantenimiento Plaza");
		JButton SalirButton = new JButton("Salir");
		
		buttonsPanel.add(CrearPlazaButton);
		buttonsPanel.add(EliminarPlazaButton);
		buttonsPanel.add(ModificarPlazaButton);
		buttonsPanel.add(ListaPlazasButton);
		buttonsPanel.add(AbandonaVehiculoButton);
		buttonsPanel.add(LlegaVehiculoButton);
		buttonsPanel.add(MantenimientoPlazaButton);
		buttonsPanel.add(SalirButton);
		
		panel.add(buttonsPanel);
		
		marco.getContentPane().add(panel);
		marco.setTitle("Menu");
		marco.pack();
		
					
		CrearPlazaButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
				GUICrearPlazaImp menu = (GUICrearPlazaImp) GUICrearPlaza.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
			}
		});

		EliminarPlazaButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
				GUIEliminarPlazaImp menu = (GUIEliminarPlazaImp) GUIEliminarPlaza.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
			}
		});
		
		ModificarPlazaButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
				GUIModificarPlazaImp menu = (GUIModificarPlazaImp) GUIModificarPlaza.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
			}
		});
		
		ListaPlazasButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
				GUIListaPlazasImp menu = (GUIListaPlazasImp) GUIListaPlazas.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
			}
		});
		
		AbandonaVehiculoButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "Se abandona el vehículo");
				/*
				marco.setVisible(false);
				GUIFiltrarDatosImp menu = (GUIFiltrarDatosImp) GUIFiltrarDatos.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
				*/
			}
		});
		
		LlegaVehiculoButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
				GUILlegaVehiculoImp menu = (GUILlegaVehiculoImp) GUILlegaVehiculo.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
			}
		});
		
		MantenimientoPlazaButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "Se lleva a cabo el mantenimiento de la plaza");
				/*
				marco.setVisible(false);
				GUIEliminarPanelImp menu = (GUIEliminarPanelImp) GUIEliminarPanel.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
				*/
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
