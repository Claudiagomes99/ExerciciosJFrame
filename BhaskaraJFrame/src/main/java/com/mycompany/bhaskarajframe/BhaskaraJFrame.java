/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bhaskarajframe;

/**
 *
 * @author Cviei
 */
import javax.swing.*;
import java.awt.*;

public class BhaskaraJFrame extends JFrame {

    JLabel la, lb, lc, resultado;
    JTextField ta, tb, tc;
    JButton calcular, limpar;

    public BhaskaraJFrame() {

        super("Fórmula de Bhaskara");

        setSize(420, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        getContentPane().setBackground(new Color(40, 20, 60));

        la = new JLabel("Valor de A:");
        la.setBounds(40, 40, 100, 25);
        la.setForeground(Color.WHITE);

        lb = new JLabel("Valor de B:");
        lb.setBounds(40, 90, 100, 25);
        lb.setForeground(Color.WHITE);

        lc = new JLabel("Valor de C:");
        lc.setBounds(40, 140, 100, 25);
        lc.setForeground(Color.WHITE);

        ta = criarCampo(160, 40);
        tb = criarCampo(160, 90);
        tc = criarCampo(160, 140);

        calcular = criarBotao("Calcular", new Color(155, 89, 182));
        calcular.setBounds(40, 220, 150, 35);

        limpar = criarBotao("Limpar", new Color(192, 57, 43));
        limpar.setBounds(210, 220, 150, 35);

        resultado = new JLabel("", SwingConstants.CENTER);
        resultado.setBounds(40, 290, 320, 40);
        resultado.setForeground(Color.WHITE);
        resultado.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        calcular.addActionListener(e -> calcularBhaskara());
        limpar.addActionListener(e -> limpar());

        add(la);
        add(lb);
        add(lc);

        add(ta);
        add(tb);
        add(tc);

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

    private void calcularBhaskara() {

        try {

            double a = Double.parseDouble(ta.getText());
            double b = Double.parseDouble(tb.getText());
            double c = Double.parseDouble(tc.getText());

            double delta = (b * b) - (4 * a * c);

            if (delta < 0) {

                resultado.setText("Delta negativo!");

            } else {

                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                resultado.setText("X1 = " + x1 + " | X2 = " + x2);

            }

        } catch (Exception e) {

            resultado.setText("Digite valores válidos!");

        }
    }

    private void limpar() {

        ta.setText("");
        tb.setText("");
        tc.setText("");
        resultado.setText("");

    }

   }