package br.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    JButton buttonAdicionar;
    JButton buttonResetar;
    JButton buttonDiminuir;
    JLabel label;

    int contador = 0;

    public MainFrame() {

        // Botão Adicionar
        buttonAdicionar = new JButton("Adicionar");
        buttonAdicionar.setBounds(40, 110, 126, 50);
        buttonAdicionar.addActionListener(this);
        buttonAdicionar.setFocusable(false);

        // Botão Diminuir
        buttonDiminuir = new JButton("Diminuir");
        buttonDiminuir.setBounds(186, 110, 126, 50);
        buttonDiminuir.addActionListener(this);
        buttonDiminuir.setFocusable(false);

        // Botão Resetar
        buttonResetar = new JButton("Resetar");
        buttonResetar.setBounds(332, 110, 126, 50);
        buttonResetar.addActionListener(this);
        buttonResetar.setFocusable(false);

        // Label do contador
        label = new JLabel("0");
        label.setBounds(150, 40, 200, 50);
        label.setFont(new Font("Arial", Font.BOLD, 32));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Frame
        this.setTitle("Contador");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);

        // Fundo verde (chromakey)
        this.getContentPane().setBackground(new Color(10, 255, 0));

        // Add componentes
        this.add(buttonAdicionar);
        this.add(buttonDiminuir);
        this.add(buttonResetar);
        this.add(label);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonAdicionar) {
            contador++;
        }
        if (e.getSource() == buttonDiminuir) {
            contador--;
            if(contador<0){
                contador = 0;
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(
                        this,
                        "Contador não pode ser negativo.",
                        "Aviso",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        }
        if (e.getSource() == buttonResetar) {
            contador = 0;
        }

        label.setText(String.valueOf(contador));
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
