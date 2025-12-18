package br.com.Aula03;

import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("exempoIcon.png");
        image.setImage(image.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));

        JLabel label = new JLabel();
        label.setFont(new Font("Tahoma", Font.BOLD, 25));
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 150, 150);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        greenPanel.add(label); // ADICIONANDO O LABEL NO PAINEL
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
