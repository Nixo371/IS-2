package operaciones.presentacion;

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


	public GUIMenuCUsImp() {
		// TODO Auto-generated method stub
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
		
		JButton GestionManualButton = new JButton("Gestion Manual Asignaciones");
		JButton ConsultarPuertasButton = new JButton("Consultar y Modificar Puertas");
		JButton SalirButton = new JButton("Salir");
		
		buttonsPanel.add(GestionManualButton);
		buttonsPanel.add(ConsultarPuertasButton);
	    buttonsPanel.add(SalirButton);
		

		panel.add(buttonsPanel);
		
		marco.getContentPane().add(panel);
		marco.setTitle("Menu");
		marco.pack();
		
		GestionManualButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controlador.getInstancia().accion(Eventos.GESTION_MANUAL_ASIGNACIONES, null);
			}
		});

		ConsultarPuertasButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controlador.getInstancia().accion(Eventos.CONSULTAR_PUERTAS, null);
			}
		});

		
		SalirButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e ) {
				marco.setVisible(false);
			}
		});
		
		marco.setVisible(true);
	}
	
	
	public JFrame getFrame() {
		return marco;
	}


	@Override
	public void actualizar(int evento, Object datos) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}