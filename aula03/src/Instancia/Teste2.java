/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instancia;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class Teste2 {

    public static void main(String[] args) {

        Funcalc chamar = new Funcalc();
        try {

            int op = Integer.parseInt(JOptionPane.showInputDialog("Digite o operador"));

            if (op == 1) {
                chamar.soma();
            } else if (op == 2) {
                chamar.sub();
            } else if (op == 3) {
                chamar.mult();
            } else if (op == 4) {
                chamar.div();
            } else {
                System.out.println("valor invalido");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "valor invalido ");

        }
    }
}
