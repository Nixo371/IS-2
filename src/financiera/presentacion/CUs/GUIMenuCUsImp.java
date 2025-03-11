package financiera.presentacion.CUs;

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

import financiera.presentacion.CUs.*;

public class GUIMenuCUsImp extends GUIMenuCUs {

	JFrame marco;

	public GUIMenuCUsImp() {
		marco = new JFrame();

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setPreferredSize(new Dimension(500, 250));

		JLabel title = new JLabel("Gestión financiera");
		title.setFont(new Font("Dialog", Font.PLAIN, 24));
		title.setAlignmentX(Component.CENTER_ALIGNMENT);

		panel.add(title);

		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new GridLayout(3, 3, 10, 10));
		buttonsPanel.setPreferredSize(new Dimension(500, 250));

		JButton CuentasBancariasButton = new JButton("Cuentas bancarias");
		JButton ContabilidadButton = new JButton("Contabilidad");
		JButton FlujosCajaButton = new JButton("Flujos de caja");
		JButton RealizarOperacionButton = new JButton("Realizar operación");
		JButton SalirButton = new JButton("Salir");
		
		buttonsPanel.add(CuentasBancariasButton);
		buttonsPanel.add(ContabilidadButton);
		buttonsPanel.add(FlujosCajaButton);
		buttonsPanel.add(RealizarOperacionButton);
		buttonsPanel.add(SalirButton);

		panel.add(buttonsPanel);

		marco.getContentPane().add(panel);
		marco.setTitle("FINANZAS");
		marco.pack();

		CuentasBancariasButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
				GUICuentasBancariasImp menu = (GUICuentasBancariasImp) GUICuentasBancarias.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
			}
		});

		ContabilidadButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
				GUIContabilidadImp menu = (GUIContabilidadImp) GUIContabilidad.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
			}
		});

		FlujosCajaButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
				GUIFlujosCajaImp menu = (GUIFlujosCajaImp) GUIFlujosCaja.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
			}
		});
		
		RealizarOperacionButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
				GUIRealizarOperacionImp menu = (GUIRealizarOperacionImp) GUIRealizarOperacion.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
			}
		});
		
		SalirButton.addActionListener(new ActionListener()	{ 
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
			}
		});
		
		marco.setVisible(true);
	}

	// m�todo actualizar de la vista
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