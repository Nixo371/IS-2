
package financiera.presentacion.CUs;

import java.awt.*;
import javax.swing.*;
import financiera.presentacion.Controlador;
import financiera.presentacion.Eventos;

public class GUIFlujosCajaImp extends GUIFlujosCaja {

    String funcButtonName = "Registrar nuevo"; 
    String tituloPanel = "FLUJOS DE CAJA";
    int eventoFunc = Eventos.REGISTRAR_CONTA;
    String descFunc = "Se añadirán los datos";

    JFrame marco;

    public GUIFlujosCajaImp() {
        marco = new JFrame(tituloPanel);
        marco.setSize(600, 500);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(null);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Título
        JLabel title = new JLabel(tituloPanel, SwingConstants.CENTER);
        title.setFont(new Font("Dialog", Font.BOLD, 24));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(title);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Panel contenedor de flujos de caja
        JPanel panelFlujos = new JPanel();
        panelFlujos.setLayout(new BoxLayout(panelFlujos, BoxLayout.Y_AXIS));

        // Agregar ejemplos de flujos de caja sin dólares
        panelFlujos.add(crearTarjetaFlujo(1, "Cobro de Arrendamientos - Locales Comerciales", 
                                          "50,000", "01/10/2024", 
                                          "Cobro correspondiente al arrendamiento mensual de los locales comerciales dentro del aeropuerto."));
        panelFlujos.add(crearTarjetaFlujo(2, "Pago de Nómina de Empleados", 
                                          "100,000", "01/10/2024", 
                                          "Se ha procesado el pago de la nómina correspondiente al personal del aeropuerto."));

        // ScrollPane para permitir desplazamiento
        JScrollPane scrollPane = new JScrollPane(panelFlujos);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(550, 250));

        // Panel de botones
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton funcButton = new JButton(funcButtonName);
        JButton returnButton = new JButton("Volver");

        buttonPanel.add(funcButton);
        buttonPanel.add(returnButton);

        // Agregar componentes al panel principal
        panel.add(scrollPane);
        panel.add(buttonPanel);

        // Agregar el panel al frame
        marco.getContentPane().add(panel);
        marco.setVisible(true);

        // Listeners de botones
        funcButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, descFunc);
            Controlador.getInstancia().accion(eventoFunc, null);
        });

        returnButton.addActionListener(e -> {
            marco.setVisible(false);
            Controlador.getInstancia().accion(Eventos.VOLVER_MENU, null);
        });
    }

    // Método para crear tarjetas de flujo de caja
    private JPanel crearTarjetaFlujo(int num, String titulo, String monto, String fecha, String descripcion) {
        JPanel tarjeta = new JPanel();
        tarjeta.setLayout(new BoxLayout(tarjeta, BoxLayout.Y_AXIS));
        tarjeta.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));
        tarjeta.setBackground(new Color(245, 245, 245));
        tarjeta.setPreferredSize(new Dimension(550, 100));

        tarjeta.add(new JLabel("<html><b>" + num + ". " + titulo + "</b></html>"));
        tarjeta.add(new JLabel("Monto: " + monto));
        tarjeta.add(new JLabel("Fecha: " + fecha));
        tarjeta.add(new JLabel("<html><i>Descripción:</i> " + descripcion + "</html>"));

        return tarjeta;
    }

    @Override
    public void actualizar(int evento, Object datos) {
        // Implementación futura
    }

    public JFrame getFrame() {
        return marco;
    }
}


