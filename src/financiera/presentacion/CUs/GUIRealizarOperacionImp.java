//package financiera.presentacion.CUs;
//
//import java.awt.Component;
//import java.awt.Dimension;
//import java.awt.FlowLayout;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.Box;
package financiera.presentacion.CUs;

import java.awt.*;
import javax.swing.*;

public class GUIRealizarOperacionImp extends GUIRealizarOperacion {

    JFrame marco;
    
    public GUIRealizarOperacionImp() {
        marco = new JFrame();
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(600, 400));
        
        JLabel title = new JLabel("REALIZAR NUEVA OPERACIÓN");
        title.setFont(new Font("Dialog", Font.BOLD, 24));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JPanel tipoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JComboBox<String> tipoTransaccion = new JComboBox<>(new String[]{"Pago", "Ingreso", "Inversión", "Solicitar préstamo"});
        JComboBox<String> cuenta = new JComboBox<>(new String[]{"Cuenta 1", "Cuenta 2"});
        JTextField monto = new JTextField("200.000 €", 10);
        tipoPanel.add(new JLabel("Tipo transacción"));
        tipoPanel.add(tipoTransaccion);
        tipoPanel.add(new JLabel("Cuenta"));
        tipoPanel.add(cuenta);
        tipoPanel.add(new JLabel("Monto"));
        tipoPanel.add(monto);
        
        JPanel seguridadPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPasswordField contrasena = new JPasswordField(10);
        JTextField codigoSeguridad = new JTextField(10);
        seguridadPanel.add(new JLabel("Contraseña"));
        seguridadPanel.add(contrasena);
        seguridadPanel.add(new JLabel("Código seguridad"));
        seguridadPanel.add(codigoSeguridad);
        
        JPanel opcionesPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JCheckBox enviarComprobante = new JCheckBox("Enviar comprobante");
        JRadioButton registrarAuto = new JRadioButton("Registrar automáticamente en contabilidad");
        opcionesPanel.add(enviarComprobante);
        opcionesPanel.add(registrarAuto);
        
        JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton confirmar = new JButton("Confirmar");
        JButton cancelar = new JButton("Cancelar");
        botonesPanel.add(confirmar);
        botonesPanel.add(cancelar);
        
        panel.add(title);
        panel.add(tipoPanel);
        panel.add(seguridadPanel);
        panel.add(opcionesPanel);
        panel.add(botonesPanel);
        
        marco.getContentPane().add(panel);
        marco.setTitle("Realizar Operación");
        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actualizar(int evento, Object datos) {
        // Implementación futura
    }

    public JFrame getFrame() {
        return marco;
    }
}

//import javax.swing.BoxLayout;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;
//
//import financiera.presentacion.Controlador;
//import financiera.presentacion.Eventos;
//
//public class GUIRealizarOperacionImp extends GUIRealizarOperacion{
//
//	String funcButtonName = "Registrar nuevo"; //El texto que sale en el botón de la función
//	String[] columnas = {"ID", "Fecha", "Cuenta", "Debe", "Haber"}; 
//	String tituloTabla = "Registros contables"; 
//	String tituloPanel = "REGISTROS CONTABLES";
//	int eventoFunc = Eventos.REGISTRAR_CONTA; //Tenéis que añadir el vuestro a la clase Eventos y al Controlador
//	String descFunc = "Se añadirán los datos"; //Mensaje por defecto hasta implementar funcionalidad real
//	//---------------------------------
//	
//	//Añadid también el evento VOLVER_MENU a la clase Eventos y al Controlador:
////		case (Eventos.VOLVER_MENU): {
////			GUIMenuCUsImp menu = (GUIMenuCUsImp) GUIMenuCUs.getInstancia();
////			JFrame menuFrame = menu.getFrame();
////			menuFrame.setVisible(true);
////		}
////	GUIMenuCUsImp es la clase con los botones para acceder a los menus de cada caso de uso 
//	
//	JFrame marco;
//	
//	public GUIRealizarOperacionImp()	{
//		marco = new JFrame();
//		
//		JPanel panel = new JPanel();
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.setPreferredSize(new Dimension(500, 250));
//		
//		JPanel funcButtonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//		JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//		JPanel returnButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
//		
//		JButton cancelButton = new JButton("Cancelar");
//		JButton acceptButton = new JButton("Aceptar");
//		JButton funcButton = new JButton(funcButtonName);
//		JButton returnButton = new JButton("Volver");
//		
//		buttonsPanel.add(acceptButton);
//		buttonsPanel.add(cancelButton);
//		returnButtonPanel.add(returnButton);
//		funcButtonPanel.add(funcButton);
//		
//		JScrollPane table = new JScrollPane(new JTable(new DefaultTableModel(columnas, 10)));
//		
//		JLabel title = new JLabel(tituloTabla);
//		title.setFont(new Font("Dialog", Font.PLAIN, 24));
//		title.setAlignmentX(Component.CENTER_ALIGNMENT);
//        
//		panel.add(title);
//		panel.add(Box.createHorizontalGlue());
//		panel.add(funcButtonPanel);
//		panel.add(table);
//		panel.add(buttonsPanel);
//		panel.add(returnButtonPanel);
//		
//		
//		marco.getContentPane().add(panel);
//		marco.setTitle(tituloPanel);
//		marco.pack();
//		
//					
//		acceptButton.addActionListener(new ActionListener()	{ 
//			public void actionPerformed(ActionEvent e){
//				Controlador.getInstancia().accion(Eventos.ACEPTAR_CAMBIOS, null);
//			}
//		});
//		
//		cancelButton.addActionListener(new ActionListener()	{ 
//			public void actionPerformed(ActionEvent e){
//				Controlador.getInstancia().accion(Eventos.CANCELAR_CAMBIOS, null);
//			}
//		});
//		
//		funcButton.addActionListener(new ActionListener()	{ 
//			public void actionPerformed(ActionEvent e){
//				JOptionPane.showMessageDialog(null, descFunc);
//				Controlador.getInstancia().accion(eventoFunc, null); 
//			}
//		});
//		
//		returnButton.addActionListener(new ActionListener()	{ 
//			public void actionPerformed(ActionEvent e){
//				marco.setVisible(false);
//				Controlador.getInstancia().accion(Eventos.VOLVER_MENU, null);
//			}
//		});
//		
//		
//		marco.setVisible(true);
//	}
//
//	@Override
//	public void actualizar(int evento, Object datos) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public JFrame getFrame() {
//		// TODO Auto-generated method stub
//		return marco;
//	}
//
//
//}
