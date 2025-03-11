package incidencias.presentacion.CUs;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import incidencias.presentacion.Controlador;
import incidencias.presentacion.Eventos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICrearIncidenciaImp extends GUICrearIncidencia {

    String funcButtonName = "Continuar";
    String[] columnas = { "Vuelo", "Fecha", "Información", "Estado", "Solución" };
    String tituloTabla = "CREAR INCIDENCIA DE VUELO";
    String tituloPanel = "Añadir Incidencia";
    int eventoFunc = Eventos.CREAR_INCIDENCIA;
    String descFunc = "Se registrará la incidencia del vuelo.";

    JFrame marco;

    public GUICrearIncidenciaImp() {
        marco = new JFrame();
        marco.setSize(500, 400);
        marco.setLayout(new BorderLayout());

        // Panel del título
        JLabel titleLabel = new JLabel(tituloTabla, SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setOpaque(true);
        titleLabel.setBackground(new Color(80, 90, 110));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setPreferredSize(new Dimension(500, 50));
        marco.add(titleLabel, BorderLayout.NORTH);

        // Panel de contenido
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Campos de información
        panel.add(new JLabel("Vuelo:"));
        JTextField flightField = new JTextField("BB700");
        flightField.setEditable(false);
        panel.add(flightField);

        panel.add(new JLabel("Fecha:"));
        JTextField dateField = new JTextField("15/11/2024");
        dateField.setEditable(false);
        panel.add(dateField);

        panel.add(new JLabel("Información:"));
        JTextField infoField = new JTextField("Retraso en despegue");
        infoField.setEditable(false);
        panel.add(infoField);

        panel.add(new JLabel("Estado:"));
        JLabel statusLabel = new JLabel("●", SwingConstants.CENTER);
        statusLabel.setFont(new Font("Arial", Font.BOLD, 20));
        statusLabel.setForeground(Color.RED);
        panel.add(statusLabel);

        panel.add(new JLabel("Solución:"));
        JTextField solutionField = new JTextField();
        panel.add(solutionField);

        marco.add(panel, BorderLayout.CENTER);

        // Panel de botones
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JButton backButton = new JButton("Volver");
        JButton continueButton = new JButton("Continuar");
//        continueButton.setBackground(new Color(80, 90, 110));
//        continueButton.setForeground(Color.WHITE);

        buttonPanel.add(backButton);
        buttonPanel.add(continueButton);
        marco.add(buttonPanel, BorderLayout.SOUTH);

        // Acción del botón Continuar
        continueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, descFunc);
                Controlador.getInstancia().accion(eventoFunc, null);
            }
        });

        // Acción del botón Volver
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marco.setVisible(false);
                Controlador.getInstancia().accion(Eventos.VOLVER_MENU, null);
            }
        });

        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }

    public void actualizar(int evento, Object datos) {
        // Implementación según el evento recibido
    }

    public JFrame getFrame() {
        return marco;
    }
}
