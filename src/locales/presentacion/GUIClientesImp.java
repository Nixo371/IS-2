package locales.presentacion;


import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.HashMap;

public class GUIClientesImp extends GUIClientes {

	JFrame marco= null; 	JLabel campo1= null;
	JLabel campo2= null; 	JLabel campo0=null;
	JTextField campo3=null; JTextField campo4=null;


	public GUIClientesImp()	{
		marco= new JFrame();
		JPanel panel= new JPanel();
		
		campo1 = new JLabel("id 1: ");
		campo2 = new JLabel("id 2: ");
		campo3= new JTextField(5);
		campo4= new JTextField(5);
		JButton botonok= new JButton("OK");
				
		panel.add(campo1);
		panel.add(campo3);
		panel.add(campo2);		
		panel.add(campo4);
		panel.add(botonok);
		
		marco.getContentPane().add(panel);
		marco.setTitle("Suma horas de los empleados");
		marco.pack();
		
					
		
		botonok.addActionListener(new ActionListener()	{ 
			
			public void actionPerformed(ActionEvent e){
				marco.setVisible(false);
				//si los campos est�n vac�o el controlador ejecuta la acci�n indicada
				if (campo3.getText().equals("") || campo4.getText().equals(""))  
					Controlador.getInstancia().accion(Eventos.CAMPOS_VACIOS, null); 
				
				
    			else {
					HashMap<String, String> ids= new HashMap<String, String>();
					ids.put("id1", campo3.getText());
					ids.put("id2", campo4.getText());
					Controlador.getInstancia().accion(Eventos.CLIENTES_SUMAR, ids);
				}  
			}
		}
		);
		
		
		marco.setVisible(true);
	}
	
	
	//m�todo actualizar de la vista
	public void actualizar(int evento, Object datos) {
		switch (evento)		{
		case (Eventos.CLIENTES_LIMPIAR): { 
			                               campo3.setText(null);
										   campo4.setText(null);
										   marco.setVisible(true);
										  break;
										 }
		}
	};
	
}