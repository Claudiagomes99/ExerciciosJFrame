/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediajframe;

/**
 *
 * @author Cviei
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MediaJFrame extends JFrame {

    JLabel rotulo1, rotulo2, rotulo3, rotulo4, labelResultado;
    JTextField texto1, texto2, texto3, texto4;
    JButton btnCalcular, btnLimpar;

    public MediaJFrame() {

        super("Média das Notas");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(420, 420);
        setLocationRelativeTo(null);
        setLayout(null);

        getContentPane().setBackground(new Color(20, 40, 70));

        rotulo1 = new JLabel("1ª Nota:");
        rotulo1.setBounds(40, 30, 100, 25);
        rotulo1.setForeground(Color.WHITE);

        rotulo2 = new JLabel("2ª Nota:");
        rotulo2.setBounds(40, 80, 100, 25);
        rotulo2.setForeground(Color.WHITE);

        rotulo3 = new JLabel("3ª Nota:");
        rotulo3.setBounds(40, 130, 100, 25);
        rotulo3.setForeground(Color.WHITE);

        rotulo4 = new JLabel("4ª Nota:");
        rotulo4.setBounds(40, 180, 100, 25);
        rotulo4.setForeground(Color.WHITE);

        texto1 = criarCampo(160, 30);
        texto2 = criarCampo(160, 80);
        texto3 = criarCampo(160, 130);
        texto4 = criarCampo(160, 180);

        btnCalcular = criarBotao("Calcular Média", new Color(52, 152, 219));
        btnCalcular.setBounds(40, 250, 155, 35);

        btnLimpar = criarBotao("Limpar", new Color(192, 57, 43));
        btnLimpar.setBounds(215, 250, 155, 35);

        labelResultado = new JLabel("", SwingConstants.CENTER);
        labelResultado.setBounds(40, 310, 330, 40);
        labelResultado.setForeground(Color.WHITE);
        labelResultado.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        btnCalcular.addActionListener(e -> calcularMedia());
        btnLimpar.addActionListener(e -> limpar());

        add(rotulo1);
        add(rotulo2);
        add(rotulo3);
        add(rotulo4);

        add(texto1);
        add(texto2);
        add(texto3);
        add(texto4);

        add(btnCalcular);
        add(btnLimpar);
        add(labelResultado);

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

    private void calcularMedia() {

        try {

            double n1 = Double.parseDouble(texto1.getText());
            double n2 = Double.parseDouble(texto2.getText());
            double n3 = Double.parseDouble(texto3.getText());
            double n4 = Double.parseDouble(texto4.getText());

            double media = (n1 + n2 + n3 + n4) / 4;

            labelResultado.setText("Média = " + String.format("%.2f", media));

        } catch (Exception e) {

            labelResultado.setText("Digite números válidos!");

        }
    }

    private void limpar() {

        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        labelResultado.setText("");

    }

   
}