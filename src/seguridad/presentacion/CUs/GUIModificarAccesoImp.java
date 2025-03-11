package seguridad.presentacion.CUs;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import seguridad.presentacion.Controlador;
import seguridad.presentacion.Eventos;
import java.awt.*;
import java.awt.event.*;

public class GUIModificarAccesoImp extends GUIModificarAcceso {

    // Adaptación para el caso de uso "Modificar Acceso a Zona Restringida"
    //---------------------------------
    String funcButtonName = "Modificar Acceso"; // Texto del botón de la función
    String[] columnas = {"ID", "Usuario", "Zona", "Duración", "Estado"};
    String tituloTabla = "Información de Accesos";
    String tituloPanel = "Modificar Acceso a Zona Restringida";
    int eventoFunc = Eventos.MODIFICAR_ACCESO;
    String descFunc = "Se modificará el acceso a la zona restringida para el usuario seleccionado";
    //---------------------------------

    JFrame marco;

    public GUIModificarAccesoImp() {
        marco = new JFrame();

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(500, 300));

        JPanel funcButtonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JPanel returnButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JButton cancelButton = new JButton("Cancelar");
        JButton acceptButton = new JButton("Aceptar");
        JButton funcButton = new JButton(funcButtonName);
        JButton returnButton = new JButton("Volver");

        buttonsPanel.add(acceptButton);
        buttonsPanel.add(cancelButton);
        returnButtonPanel.add(returnButton);
        funcButtonPanel.add(funcButton);

        JScrollPane table = new JScrollPane(new JTable(new DefaultTableModel(columnas, 5)));

        JLabel title = new JLabel(tituloTabla);
        title.setFont(new Font("Dialog", Font.PLAIN, 24));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(title);
        panel.add(Box.createHorizontalGlue());
        panel.add(funcButtonPanel);
        panel.add(table);
        panel.add(buttonsPanel);
        panel.add(returnButtonPanel);

        marco.getContentPane().add(panel);
        marco.setTitle(tituloPanel);
        marco.pack();

        // Acciones de los botones

        acceptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Controlador.getInstancia().accion(Eventos.ACEPTAR_CAMBIOS, null);
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Controlador.getInstancia().accion(Eventos.CANCELAR_CAMBIOS, null);
            }
        });

        funcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, descFunc);
                Controlador.getInstancia().accion(eventoFunc, null);
            }
        });

        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marco.setVisible(false);
                Controlador.getInstancia().accion(Eventos.VOLVER_MENU, null);
            }
        });

        marco.setVisible(true);
    }

    public void actualizar(int evento, Object datos) {
        // Implementar según el evento recibido.
    }

    public JFrame getFrame() {
        return marco;
    }
}
