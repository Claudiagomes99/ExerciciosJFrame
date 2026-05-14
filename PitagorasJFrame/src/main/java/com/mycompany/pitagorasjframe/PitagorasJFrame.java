/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pitagorasjframe;

/**
 *
 * @author Cviei
 */

import javax.swing.*;
import java.awt.*;

public class PitagorasJFrame extends JFrame {

    JLabel cat1, cat2, resultado;
    JTextField txt1, txt2;
    JButton calcular, limpar;

    public PitagorasJFrame() {

        super("Teorema de Pitágoras");

        setSize(420, 350);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        getContentPane().setBackground(new Color(15, 60, 50));

        cat1 = new JLabel("Cateto A:");
        cat1.setBounds(40, 40, 100, 25);
        cat1.setForeground(Color.WHITE);

        cat2 = new JLabel("Cateto B:");
        cat2.setBounds(40, 100, 100, 25);
        cat2.setForeground(Color.WHITE);

        txt1 = criarCampo(160, 40);
        txt2 = criarCampo(160, 100);

        calcular = criarBotao("Calcular", new Color(26, 188, 156));
        calcular.setBounds(40, 180, 150, 35);

        limpar = criarBotao("Limpar", new Color(192, 57, 43));
        limpar.setBounds(210, 180, 150, 35);

        resultado = new JLabel("", SwingConstants.CENTER);
        resultado.setBounds(40, 250, 320, 40);
        resultado.setForeground(Color.WHITE);
        resultado.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        calcular.addActionListener(e -> calcularHipotenusa());
        limpar.addActionListener(e -> limpar());

        add(cat1);
        add(cat2);

        add(txt1);
        add(txt2);

        add(calcular);
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

    private void calcularHipotenusa() {

        try {

            double a = Double.parseDouble(txt1.getText());
            double b = Double.parseDouble(txt2.getText());

            double c = Math.sqrt((a * a) + (b * b));

            resultado.setText("Hipotenusa = " + String.format("%.2f", c));

        } catch (Exception e) {

            resultado.setText("Digite números válidos!");

        }
    }

    private void limpar() {

        txt1.setText("");
        txt2.setText("");
        resultado.setText("");

    }

   
}
