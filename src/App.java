import net.masi.salesianos.actividad.Restaurante;
import net.masi.salesianos.actividad.Schedule;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class App {
    private static ArrayList<Restaurante> restaurantes = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Agregar Restaurante");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(5, 2));

        JTextField nameField = new JTextField(20);
        JTextField locationField = new JTextField(20);
        JTextField scheduleField = new JTextField(20);
        JTextField rateField = new JTextField(20);

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

                String openingTime = scheduleField.getText().split("-")[0].trim();
                String closingTime = scheduleField.getText().split("-")[1].trim();

                String rate = rateField.getText();

                Restaurante restaurante = new Restaurante(name, location, new Schedule(openingTime, closingTime), rate);

                restaurantes.add(restaurante);

                System.out.println(restaurantes);

                nameField.setText("");
                locationField.setText("");
                scheduleField.setText("");
                rateField.setText("");

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
