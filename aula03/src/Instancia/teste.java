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
public class teste {
    public static void main(String[] args) {
        Funcalc chamar = new Funcalc ();
        
        String op = JOptionPane.showInputDialog(" Digite o operador: ");
        
        if (op.equals("+")){
             chamar.soma();
        }else if (op.equals("-")){
             chamar.sub();
        }else if (op.equals("*")){
             chamar.mult();
        }else if (op.equals("/")){
             chamar.div();
        }else System.out.println("Valor invalido");
        
        
        
        
        chamar.mult();
        
        chamar.div();
     }
   
}
