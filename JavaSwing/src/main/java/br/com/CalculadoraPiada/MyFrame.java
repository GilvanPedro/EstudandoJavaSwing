package br.com.CalculadoraPiada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    JLabel plusLabel;
    JTextArea num1;
    JTextArea num2;

    MyFrame() {

        // Campo 1
        num1 = new JTextArea();
        num1.setBounds(110, 40, 100, 40);
        num1.setFont(new Font("Arial", Font.PLAIN, 18));

        // "+"
        plusLabel = new JLabel("+");
        plusLabel.setBounds(220, 40, 30, 40);
        plusLabel.setFont(new Font("Arial", Font.BOLD, 26));
        plusLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Campo 2
        num2 = new JTextArea();
        num2.setBounds(260, 40, 100, 40);
        num2.setFont(new Font("Arial", Font.PLAIN, 18));

        // Botão
        button = new JButton("Calcular");
        button.setBounds(160, 110, 180, 50);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setForeground(new Color(120, 65, 255));
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Resultado
        label = new JLabel();
        label.setBounds(150, 190, 200, 50);
        label.setFont(new Font("Arial", Font.BOLD, 22));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVisible(false);

        // Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);

        // Add
        this.add(num1);
        this.add(plusLabel);
        this.add(num2);
        this.add(button);
        this.add(label);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            try {
                double n1 = Double.parseDouble(num1.getText().replace(",", "."));
                double n2 = Double.parseDouble(num2.getText().replace(",", "."));

                label.setText("Hello World!!");
                label.setVisible(true);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Digite números válidos!");
            }
        }
    }
}
