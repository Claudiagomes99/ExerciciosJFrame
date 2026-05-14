/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triangulojframe;

/**
 *
 * @author Cviei
 */

import javax.swing.*;
import java.awt.*;

public class TrianguloJFrame extends JFrame {

    JLabel l1, l2, l3, resultado;
    JTextField t1, t2, t3;
    JButton verificar, limpar;

    public TrianguloJFrame() {

        super("Tipos de Triângulo");

        setSize(420, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        getContentPane().setBackground(new Color(70, 35, 20));

        l1 = new JLabel("Lado 1:");
        l1.setBounds(40, 40, 100, 25);
        l1.setForeground(Color.WHITE);

        l2 = new JLabel("Lado 2:");
        l2.setBounds(40, 100, 100, 25);
        l2.setForeground(Color.WHITE);

        l3 = new JLabel("Lado 3:");
        l3.setBounds(40, 160, 100, 25);
        l3.setForeground(Color.WHITE);

        t1 = criarCampo(160, 40);
        t2 = criarCampo(160, 100);
        t3 = criarCampo(160, 160);

        verificar = criarBotao("Verificar", new Color(230, 126, 34));
        verificar.setBounds(40, 240, 150, 35);

        limpar = criarBotao("Limpar", new Color(192, 57, 43));
        limpar.setBounds(210, 240, 150, 35);

        resultado = new JLabel("", SwingConstants.CENTER);
        resultado.setBounds(40, 310, 320, 40);
        resultado.setForeground(Color.WHITE);
        resultado.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        verificar.addActionListener(e -> verificarTriangulo());
        limpar.addActionListener(e -> limpar());

        add(l1);
        add(l2);
        add(l3);

        add(t1);
        add(t2);
        add(t3);

        add(verificar);
        add(limpar);

        add(resultado);

        setVisible(true);
    }

    private JTextField criarCampo(int x, int y) {

        JTextField campo = new JTextField();
        campo.setBounds(x, y, 180, 30);
        return campo;

    }

    private JButton criarBotao(String texto, Color cor) {

        JButton btn = new JButton(texto);
        btn.setBackground(cor);
        btn.setForeground(Color.WHITE);
        return btn;

    }

    private void verificarTriangulo() {

        try {

            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double c = Double.parseDouble(t3.getText());

            if (a == b && b == c) {

                resultado.setText("Triângulo Equilátero");

            } else if (a == b || a == c || b == c) {

                resultado.setText("Triângulo Isósceles");

            } else {

                resultado.setText("Triângulo Escaleno");

            }

        } catch (Exception e) {

            resultado.setText("Digite valores válidos!");

        }
    }

    private void limpar() {

        t1.setText("");
        t2.setText("");
        t3.setText("");
        resultado.setText("");

    }

 
}
