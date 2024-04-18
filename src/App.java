import net.masi.salesianos.actividad.classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class App {
    private static ArrayList<Restaurante> restaurantes = new ArrayList<>();

    public static void main(String[] args) {
        InterfazUsuario ui = new InterfazUsuario();
        ui.crearInterfaz();
    }

    public static void agregarRestaurante(String name, String location, String schedule, String rate) {
        String openingTime = schedule.split("-")[0].trim();
        String closingTime = schedule.split("-")[1].trim();
        Restaurante restaurante = new Restaurante(name, location, new Schedule(openingTime, closingTime), rate);
        restaurantes.add(restaurante);
        System.out.println(restaurantes);
    }
}

class InterfazUsuario {
    private JFrame frame;
    private JTextField nameField;
    private JTextField locationField;
    private JTextField scheduleField;
    private JTextField rateField;

    public void resetearFormulario() {
        nameField.setText("");
        locationField.setText("");
        scheduleField.setText("");
        rateField.setText("");
    }

    public void crearInterfaz() {
        frame = new JFrame("Agregar Restaurante");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(5, 2));

        nameField = new JTextField(20);
        locationField = new JTextField(20);
        scheduleField = new JTextField(20);
        rateField = new JTextField(20);

        panel.add(new JLabel("Nombre:"));
        panel.add(nameField);
        panel.add(new JLabel("Ubicación:"));
        panel.add(locationField);
        panel.add(new JLabel("Horario:"));
        panel.add(scheduleField);
        panel.add(new JLabel("Puntuación:"));
        panel.add(rateField);

        JButton addButton = new JButton("Agregar Restaurante");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String location = locationField.getText();
                String schedule = scheduleField.getText();
                String rate = rateField.getText();

                App.agregarRestaurante(name, location, schedule, rate);
                resetearFormulario();

                JOptionPane.showMessageDialog(frame, "Restaurante agregado correctamente.");
            }
        });
        panel.add(addButton);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
