package locales.presentacion.CUs;


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

	JFrame victoria;
	
	public GUIMenuCUsImp()	{
		victoria = new JFrame();
		
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
		
		JButton MostrarLocalesButton = new JButton("Mostrar Locales");
		JButton ModificarLocalesButton = new JButton("Modificar Locales");
		JButton AñadirLocalesButton = new JButton("Añadir Locales");
		JButton EliminarLocalesButton = new JButton("Eliminar Locales");
		JButton FiltrarLocalesButton = new JButton("Filtar Locales"); //Menu bienvenida
		JButton SalirButton = new JButton("Salir");
		
		buttonsPanel.add(MostrarLocalesButton);
		buttonsPanel.add(ModificarLocalesButton);
		buttonsPanel.add(AñadirLocalesButton);
		buttonsPanel.add(EliminarLocalesButton);
		buttonsPanel.add(FiltrarLocalesButton);
		buttonsPanel.add(SalirButton);
		
		panel.add(buttonsPanel);
		
		victoria.getContentPane().add(panel);
		victoria.setTitle("Menu");
		victoria.pack();
		
					
		MostrarLocalesButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				victoria.setVisible(false);
				GUIMostrarLocalesImp menu = (GUIMostrarLocalesImp) GUIMostrarLocales.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
			}
		});
		
		ModificarLocalesButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				victoria.setVisible(false);
				GUIModificarLocalesImp menu = (GUIModificarLocalesImp) GUIModificarLocales.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
			}
		});

		AñadirLocalesButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				victoria.setVisible(false);
				GUIAñadirLocalesImp menu = (GUIAñadirLocalesImp) GUIAñadirLocales.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
			}
		});
		
		EliminarLocalesButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				victoria.setVisible(false);
				GUIEliminarLocalesImp menu = (GUIEliminarLocalesImp) GUIEliminarLocales.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
			}
		});
		
		FiltrarLocalesButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				victoria.setVisible(false);
				GUIFiltrarLocalesImp menu = (GUIFiltrarLocalesImp) GUIFiltrarLocales.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
			}
		});
		
		
		
		
		victoria.setVisible(true);
	}
	
	
	//m�todo actualizar de la vista
	public void actualizar(int evento, Object datos) {
//		switch (evento)		{
//		case (Eventos.CLIENTES_LIMPIAR): { 
//			                               campo3.setText(null);
//										   campo4.setText(null);
//										   victoria.setVisible(true);
//										  break;
//										 }
//		}
	};
	
	public JFrame getFrame() {
		return victoria;
	}
	
}