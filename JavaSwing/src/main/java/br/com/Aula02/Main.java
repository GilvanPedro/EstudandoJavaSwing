package br.com.Aula02;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("exempoIcon.png");
        image.setImage(image.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)); // REDIMENSIONA A IMAGEM
        Border border = BorderFactory.createLineBorder(Color.RED, 3);

        JLabel label = new JLabel();
        label.setText("Você ao menos programa?"); // DEFINIR O TEXTO DA JANELA
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // DEFINIR A POSIÇÃO DO TEXTO ENTRE DIREITA, ESQUEDA OU CENTRO
        label.setVerticalTextPosition(JLabel.TOP); // DEFINIR A POSIÇÃO DO TEXTO ENTRE CIMA, BAIXO OU CENTRO
        label.setForeground(Color.BLACK);
        label.setFont(new Font("MV Boli", Font.BOLD, 20)); // DEFINE UMA FONTE PARA O TEXTO
        label.setIconTextGap(10); // DISTANCIA DO TEXTO E DA IMAGEM
        label.setBackground(Color.GRAY); // DEFINIR A COR DE FUNDO
        label.setOpaque(true); // PARA FAZER A COR DE FUNDO APARECER
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBorder(border);
        // label.setBounds(100, 0, 250, 250); // DEFINE A POSIÇÃO DO X E Y, JUNTAMENTE COM A ALTURA E LARGURA NO FRAME

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500, 600);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.add(label);
        frame.pack();
    }
}
