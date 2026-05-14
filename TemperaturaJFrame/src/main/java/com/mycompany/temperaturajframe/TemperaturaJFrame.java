/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperaturajframe;

/**
 *
 * @author Cviei
 */
import javax.swing.*;
import java.awt.*;

public class TemperaturaJFrame extends JFrame {

    JLabel celsius, fahrenheit, kelvin;
    JTextField txtC, txtF, txtK;
    JButton converter, limpar;

    public TemperaturaJFrame() {

        super("Conversor de Temperatura");

        setSize(450, 380);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        getContentPane().setBackground(new Color(25, 25, 80));

        celsius = new JLabel("Graus Celsius:");
        celsius.setBounds(40, 50, 120, 25);
        celsius.setForeground(Color.WHITE);

        fahrenheit = new JLabel("Graus Fahrenheit:");
        fahrenheit.setBounds(40, 110, 140, 25);
        fahrenheit.setForeground(Color.WHITE);

        kelvin = new JLabel("Graus Kelvin:");
        kelvin.setBounds(40, 170, 120, 25);
        kelvin.setForeground(Color.WHITE);

        txtC = criarCampo(200, 50);
        txtF = criarCampo(200, 110);
        txtK = criarCampo(200, 170);

        txtF.setEditable(false);
        txtK.setEditable(false);

        converter = criarBotao("Converter", new Color(52, 152, 219));
        converter.setBounds(40, 250, 150, 35);

        limpar = criarBotao("Limpar", new Color(192, 57, 43));
        limpar.setBounds(210, 250, 150, 35);

        converter.addActionListener(e -> converterTemperatura());
        limpar.addActionListener(e -> limpar());

        add(celsius);
        add(fahrenheit);
        add(kelvin);

        add(txtC);
        add(txtF);
        add(txtK);

        add(converter);
        add(limpar);

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

    private void converterTemperatura() {

        try {

            double c = Double.parseDouble(txtC.getText());

            double f = (c * 9 / 5) + 32;
            double k = c + 273.15;

            txtF.setText(String.format("%.2f", f));
            txtK.setText(String.format("%.2f", k));

        } catch (Exception e) {

            txtF.setText("Erro");
            txtK.setText("Erro");

        }
    }

    private void limpar() {

        txtC.setText("");
        txtF.setText("");
        txtK.setText("");

    }

   
}
