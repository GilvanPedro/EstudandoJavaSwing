package br.com.Aula04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    MyFrame(){
        label = new JLabel();
        label.setText("Botão Clicado");
        label.setBounds(200, 250, 150, 150);
        label.setVisible(false);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        button = new  JButton();
        button.setBounds(135, 100, 250, 100);
        button.addActionListener(this);
        button.setText("Eu sou um botão");
        button.setFocusable(false);
        button.setForeground(new Color(70, 0, 255));
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.setLocationRelativeTo(null);
        this.add(label);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Click");
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
