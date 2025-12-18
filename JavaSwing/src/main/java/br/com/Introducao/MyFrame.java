package br.com.Introducao;

import javax.swing.*;
import java.awt.*;

public class MyFrame {
    MyFrame(){
        JFrame frame = new JFrame();

        frame.setTitle("Título da janela do JFrame"); // TÍTULO DA JANELA
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // FAZER A JANELA FECHAR QUANDO APERTAR NO X
        frame.setSize(420, 420); // DEFINIR AS DIMENSÕES
        frame.setVisible(true); // TORNAR VISÍVEL
        frame.setResizable(false); // IMPEDE QUE A JANELA SEJA MUDADA DE TAMANHO
        frame.setLocationRelativeTo(null); // CENTRALIZA A JANELA NO CENTRO DA TELA

        // MUDA A IMAGEM DO TOPO NA JANELA
        ImageIcon image = new ImageIcon("exempoIcon.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(123, 50, 250)); // MUDAR A COR DO FUNDO
    }
}
