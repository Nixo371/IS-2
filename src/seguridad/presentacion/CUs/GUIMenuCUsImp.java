package seguridad.presentacion.CUs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIMenuCUsImp extends GUIMenuCUs {

    JFrame marco;

    public GUIMenuCUsImp() {
        marco = new JFrame();

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(500, 300));

        JLabel title = new JLabel("Menú de Gestión de Seguridad");
        title.setFont(new Font("Dialog", Font.PLAIN, 24));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(title);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(3, 3, 10, 10));
        buttonsPanel.setPreferredSize(new Dimension(500, 300));

        // Botones para los casos de uso de tu subsistema
        JButton btnCrearAcceso = new JButton("Crear Acceso");
        JButton btnEliminarAcceso = new JButton("Eliminar Acceso");
        JButton btnModificarAcceso = new JButton("Modificar Acceso");
        JButton btnVerificarAcceso = new JButton("Verificar Acceso");
        JButton btnActivarDispositivo = new JButton("Activar Dispositivo");
        JButton btnDesactivarDispositivo = new JButton("Desactivar Dispositivo");
        JButton btnConfigurarDispositivo = new JButton("Configurar Dispositivo");
        JButton btnConsultarHistorial = new JButton("Consultar Historial");
        JButton btnSalir = new JButton("Salir");

        buttonsPanel.add(btnCrearAcceso);
        buttonsPanel.add(btnEliminarAcceso);
        buttonsPanel.add(btnModificarAcceso);
        buttonsPanel.add(btnVerificarAcceso);
        buttonsPanel.add(btnActivarDispositivo);
        buttonsPanel.add(btnDesactivarDispositivo);
        buttonsPanel.add(btnConfigurarDispositivo);
        buttonsPanel.add(btnConsultarHistorial);
        buttonsPanel.add(btnSalir);

        panel.add(buttonsPanel);
        marco.getContentPane().add(panel);
        marco.setTitle("Menú de Gestión de Seguridad");
        marco.pack();

        // Acción para cada botón, invocando la ventana correspondiente a cada caso de uso

        btnCrearAcceso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marco.setVisible(false);
                GUICrearAccesoImp menu = (GUICrearAccesoImp) GUICrearAcceso.getInstancia();
                JFrame menuFrame = menu.getFrame();
                menuFrame.setVisible(true);
            }
        });
 
        btnEliminarAcceso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marco.setVisible(false);
                GUIEliminarAccesoImp menu = (GUIEliminarAccesoImp) GUIEliminarAcceso.getInstancia();
                JFrame menuFrame = menu.getFrame();
                menuFrame.setVisible(true);
            }
        });

        btnModificarAcceso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marco.setVisible(false);
                GUIModificarAccesoImp menu = (GUIModificarAccesoImp) GUIModificarAcceso.getInstancia();
                JFrame menuFrame = menu.getFrame();
                menuFrame.setVisible(true);
            }
        });
        
        btnVerificarAcceso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marco.setVisible(false);
                GUIVerificarAccesoImp menu = (GUIVerificarAccesoImp) GUIVerificarAcceso.getInstancia();
                JFrame menuFrame = menu.getFrame();
                menuFrame.setVisible(true);
            }
        });
        

        btnActivarDispositivo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marco.setVisible(false);
                GUIActivarDispositivoImp menu = (GUIActivarDispositivoImp) GUIActivarDispositivo.getInstancia();
                JFrame menuFrame = menu.getFrame();
                menuFrame.setVisible(true);
            }
        });
        
        btnDesactivarDispositivo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marco.setVisible(false);
                GUIDesactivarDispositivoImp menu = (GUIDesactivarDispositivoImp) GUIDesactivarDispositivo.getInstancia();
                JFrame menuFrame = menu.getFrame();
                menuFrame.setVisible(true);
            }
        });
        
        btnConfigurarDispositivo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marco.setVisible(false);
                GUIConfigurarDispositivoImp menu = (GUIConfigurarDispositivoImp) GUIConfigurarDispositivo.getInstancia();
                JFrame menuFrame = menu.getFrame();
                menuFrame.setVisible(true);
            }
        });
        
        btnConsultarHistorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marco.setVisible(false);
                GUIConsultarHistorialImp menu = (GUIConsultarHistorialImp) GUIConsultarHistorial.getInstancia();
                JFrame menuFrame = menu.getFrame();
                menuFrame.setVisible(true);
            }
        });
		
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marco.dispose();
            }
        });

        marco.setVisible(true);
    }

    // Método para actualizar la vista en función de eventos (si es necesario)
    public void actualizar(int evento, Object datos) {
        // Implementar actualizaciones según el evento
    }

    public JFrame getFrame() {
        return marco;
    }
}
