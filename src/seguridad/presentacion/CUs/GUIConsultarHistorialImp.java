package seguridad.presentacion.CUs;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import seguridad.presentacion.Controlador;
import seguridad.presentacion.Eventos;
import java.awt.*;
import java.awt.event.*;

public class GUIConsultarHistorialImp extends GUIConsultarHistorial {

    String funcButtonName = "Consultar Historial";
    String[] columnas = {"ID", "Usuario", "Acción", "Fecha", "Resultado"};
    String tituloTabla = "Historial de Actividades";
    String tituloPanel = "Consultar Historial";
    int eventoFunc = Eventos.CONSULTAR_HISTORIAL;
    String descFunc = "Se consultará el historial de actividades";

    JFrame marco;

    public GUIConsultarHistorialImp() {
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
        acceptButton.addActionListener(e -> Controlador.getInstancia().accion(Eventos.ACEPTAR_CAMBIOS, null));
        cancelButton.addActionListener(e -> Controlador.getInstancia().accion(Eventos.CANCELAR_CAMBIOS, null));
        funcButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, descFunc);
            Controlador.getInstancia().accion(eventoFunc, null);
        });
        returnButton.addActionListener(e -> {
            marco.setVisible(false);
            Controlador.getInstancia().accion(Eventos.VOLVER_MENU, null);
        });

        marco.setVisible(true);
    }

    public void actualizar(int evento, Object datos) {}

    public JFrame getFrame() {
        return marco;
    }
}
