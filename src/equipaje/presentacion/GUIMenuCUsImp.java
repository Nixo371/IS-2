package equipaje.presentacion;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.*;
import java.util.HashMap;

public class GUIMenuCUsImp extends GUIMenuCUs {

	JFrame marco;
	
	public GUIMenuCUsImp()	{
		marco = new JFrame();
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setPreferredSize(new Dimension(500, 250));
		
		JLabel title = new JLabel("Menu Equipajes");
		title.setFont(new Font("Dialog", Font.PLAIN, 24));
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		panel.add(title);
		
		JPanel buttonsPanel= new JPanel();
		buttonsPanel.setLayout(new GridLayout(3, 3, 10, 10));
		buttonsPanel.setPreferredSize(new Dimension(500, 250));
		
		JButton AñadirDatosButton = new JButton("Registrar Equipaje");
		JButton EliminarDatosButton = new JButton("Baja de Equipaje");
		JButton ModificarDatosButton = new JButton("Modificar Equipaje");
		JButton MostrarDatosButton = new JButton("Consultar Datos");
		//JButton FiltrarDatosButton = new JButton("Filtar Datos");
		JButton AñadirPanelButton = new JButton("Asignar cinta de salida");
		//JButton EliminarPanelButton = new JButton("Eliminar Panel");
		//JButton MostrarAvisoButton = new JButton("Mostrar Aviso");
		//JButton SalirButton = new JButton("Salir");
		
		buttonsPanel.add(AñadirDatosButton);
		buttonsPanel.add(EliminarDatosButton);
		buttonsPanel.add(ModificarDatosButton);
		buttonsPanel.add(MostrarDatosButton);
		//buttonsPanel.add(FiltrarDatosButton);
		buttonsPanel.add(AñadirPanelButton);
		//buttonsPanel.add(EliminarPanelButton);
		//buttonsPanel.add(MostrarAvisoButton);
		//buttonsPanel.add(SalirButton);
		
		panel.add(buttonsPanel);
		
		marco.getContentPane().add(panel);
		marco.setTitle("Menu");
		marco.pack();
		
					
		AñadirDatosButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
				JOptionPane.showMessageDialog(null, "CU Añadir Equipaje");
			}
		});
		
		/*
		 FiltrarDatosButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
				JOptionPane.showMessageDialog(null, "CU Añadir Datos");
			}
		});

		 */
		
		EliminarDatosButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
				JOptionPane.showMessageDialog(null, "CU Dar de Baja Equipaje");
			}
		});
		
		ModificarDatosButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
				JOptionPane.showMessageDialog(null, "CU Modificar Equipaje");
			}
		});
		
		MostrarDatosButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
				JOptionPane.showMessageDialog(null, "CU Consultar Datos");
			}
		});
		
		AñadirPanelButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
				JOptionPane.showMessageDialog(null, "CU Asignar cinta de salida");
			}
		});
		
		/*
		 
		 MostrarAvisoButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
			}
			
			EliminarPanelButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
			}
	
		});
		 
		 */
		
		
		
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