package incidencias.presentacion.CUs;

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
		marco = new JFrame();

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setPreferredSize(new Dimension(500, 250));

		JLabel title = new JLabel("Gestión de incidencias");
		title.setFont(new Font("Dialog", Font.PLAIN, 24));
		title.setAlignmentX(Component.CENTER_ALIGNMENT);

		panel.add(title);

		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new GridLayout(3, 3, 10, 10));
		buttonsPanel.setPreferredSize(new Dimension(500, 250));

		JButton CrearIncidenciaButton = new JButton("Crear incidencia");
		JButton VisualizarButton= new JButton("Visualizar incidencias");
		JButton CrearRegistroButton = new JButton("Crear registro");
		JButton ActualizarIncidenciaButton = new JButton("Actualizar incidencia");
		JButton BorrarIncidenciaButton = new JButton("Borrar incidencia");
		JButton SeleccionarSoluccionButton = new JButton("Seleccionar solucion");
		//JButton EliminarPanelButton = new JButton("Eliminar Panel");
		//JButton MostrarAvisoButton = new JButton("Mostrar Aviso");
		JButton SalirButton = new JButton("Salir");

		buttonsPanel.add(CrearIncidenciaButton);
		buttonsPanel.add(VisualizarButton);
		buttonsPanel.add(CrearRegistroButton);
		buttonsPanel.add(ActualizarIncidenciaButton);
		buttonsPanel.add(BorrarIncidenciaButton);
		buttonsPanel.add(SeleccionarSoluccionButton);
//		buttonsPanel.add(EliminarPanelButton);
//		buttonsPanel.add(MostrarAvisoButton);
		buttonsPanel.add(SalirButton);
	

		
		panel.add(buttonsPanel);	
		marco.getContentPane().add(panel);
		marco.setTitle("Menu");
		marco.pack();

		CrearIncidenciaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setVisible(false);
				GUICrearIncidenciaImp menu = (GUICrearIncidenciaImp) GUICrearIncidencia.getInstancia();
				JFrame menuFrame = menu.getFrame();
				menuFrame.setVisible(true);
			}
		});

//		VisualizarButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				marco.setVisible(false);
//				GUIVisualizarIncidenciaImp menu = (GUIVisualizarIncidenciaImp) VisualizarIncidencia.getInstancia();
//				JFrame menuFrame = menu.getFrame();
//				menuFrame.setVisible(true);
//			}
//		});
//
//		CrearRegistroButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				marco.setVisible(false);
//				GUICrearRegistroImp menu = (GUICrearRegistroImp) GUICrearRegistro.getInstancia();
//				JFrame menuFrame = menu.getFrame();
//				menuFrame.setVisible(true);
//			}
//		});
//
//		ActualizarIncidenciaButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				marco.setVisible(false);
//				GUIActualizarIncidenciaImp menu = (GUIActualizarIncidenciaImp) GUIActualizarIncidencia.getInstancia();
//				JFrame menuFrame = menu.getFrame();
//				menuFrame.setVisible(true);
//			}
//		});
//
//		BorrarIncidenciaButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				marco.setVisible(false);
//				GUIBorrarIncidenciaImp menu = (GUIBorrarIncidenciaImp) GUIBorrarIncidencia.getInstancia();
//				JFrame menuFrame = menu.getFrame();
//				menuFrame.setVisible(true);
//			}
//		});
//
//		SeleccionarSoluccionButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				marco.setVisible(false);
//				GUISeleccionarSolucionImp menu = (GUISeleccionarSolucionImp) SeleccionarSolucion.getInstancia();
//				JFrame menuFrame = menu.getFrame();
//				menuFrame.setVisible(true);
//			}
//		});

//		MostrarAvisoButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				marco.setVisible(false);
//				GUIMostrarAvisoImp menu = (GUIMostrarAvisoImp) GUIMostrarAviso.getInstancia();
//				JFrame menuFrame = menu.getFrame();
//				menuFrame.setVisible(true);
//			}
//		});
//
//		EliminarPanelButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				marco.setVisible(false);
//				GUIEliminarPanelImp menu = (GUIEliminarPanelImp) GUIEliminarPanel.getInstancia();
//				JFrame menuFrame = menu.getFrame();
//				menuFrame.setVisible(true);
//			}
//		});

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