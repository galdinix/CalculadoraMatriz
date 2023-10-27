package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraMatriz {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.setLayout(null); // Define o layout como null para usar o setBounds

        JLabel labelA = new JLabel("Matriz A");
        labelA.setBounds(0, 0, 100, 25);
        panel.add(labelA);

        JTextField inputA11 = new JTextField();
        inputA11.setBounds(0, 25, 100, 25); // Define o tamanho 4x4
        JTextField inputA12 = new JTextField();
        inputA12.setBounds(100, 25, 100, 25);
        JTextField inputA21 = new JTextField();
        inputA21.setBounds(0, 50, 100, 25);
        JTextField inputA22 = new JTextField();
        inputA22.setBounds(100, 50, 100, 25);

        JLabel labelB = new JLabel("Matriz B");
        labelB.setBounds(200, 0, 100, 25);
        panel.add(labelB);

        JTextField inputB11 = new JTextField();
        inputB11.setBounds(200, 25, 100, 25);
        JTextField inputB12 = new JTextField();
        inputB12.setBounds(300, 25, 100, 25);
        JTextField inputB21 = new JTextField();
        inputB21.setBounds(200, 50, 100, 25);
        JTextField inputB22 = new JTextField();
        inputB22.setBounds(300, 50, 100, 25);

        JLabel labelC = new JLabel("Matriz C");
        labelC.setBounds(0, 75, 100, 25);
        panel.add(labelC);

        JTextField outputC11 = new JTextField();
        outputC11.setBounds(0, 100, 100, 25);
        JTextField outputC12 = new JTextField();
        outputC12.setBounds(100, 100, 100, 25);
        JTextField outputC21 = new JTextField();
        outputC21.setBounds(0, 125, 100, 25);
        JTextField outputC22 = new JTextField();
        outputC22.setBounds(100, 125, 100, 25);

        panel.add(inputA11);
        panel.add(inputA12);
        panel.add(inputA21);
        panel.add(inputA22);

        panel.add(inputB11);
        panel.add(inputB12);
        panel.add(inputB21);
        panel.add(inputB22);

        panel.add(outputC11);
        panel.add(outputC12);
        panel.add(outputC21);
        panel.add(outputC22);

        String[] buttonLabels = {
                "Somar", "Subtrair", "Multiplicar", "Escalar"
        };

        int x = 200;
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 12));
            button.setBounds(x, 100, 80, 30); // Define o tamanho do botão
            panel.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double num1, num2, result = 0.0;
                    double a11, a12, a21, a22, b11, b12, b21, b22;

                    try {
                        a11 = Double.parseDouble(inputA11.getText());
                        a12 = Double.parseDouble(inputA12.getText());
                        a21 = Double.parseDouble(inputA21.getText());
                        a22 = Double.parseDouble(inputA22.getText());

                        b11 = Double.parseDouble(inputB11.getText());
                        b12 = Double.parseDouble(inputB12.getText());
                        b21 = Double.parseDouble(inputB21.getText());
                        b22 = Double.parseDouble(inputB22.getText());

                        if (label.equals("Somar")) {
                            outputC11.setText(String.valueOf(a11 + b11));
                            outputC12.setText(String.valueOf(a12 + b12));
                            outputC21.setText(String.valueOf(a21 + b21));
                            outputC22.setText(String.valueOf(a22 + b22));
                        } else if (label.equals("Subtrair")) {
                            outputC11.setText(String.valueOf(a11 - b11));
                            outputC12.setText(String.valueOf(a12 - b12));
                            outputC21.setText(String.valueOf(a21 - b21));
                            outputC22.setText(String.valueOf(a22 - b22));
                        } else if (label.equals("Multiplicar")) {
                            System.out.println();
                        } else if (label.equals("Dividir")) {
                            System.out.println();
                            } else {
                                outputC12.setText("Erro: Divisao por zero");
                                return;
                            }
                        } else if (label.equals("Escalar")) {
                            // Implemente o código para operações com escalar aqui
                            // Adicione a lógica para lidar com a operação de escalar aqui
                        }
                        outputC12.setText(Double.toString(result));
                    } catch (NumberFormatException ex) {
                        outputC21.setText("Erro: Entrada invalida");
                    }
                }
            });

            x += 80; // Incrementa a posição X para o próximo botão
        }

        JFrame frame = new JFrame("Matrizes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.add(panel);
        frame.setVisible(true);
    }
}
