/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

import javax.swing.JOptionPane;
/**
 *
 * @author CAMARGO
 */
public class Ex05 {
    
    public static void main(String[] args) {
          
        int a = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de A: "));
        int b =  Integer.parseInt(JOptionPane.showInputDialog("digite o valor de B: "));
        int r = a+b;
       
        JOptionPane.showMessageDialog(null, "O valor da soma é: " + r );
        
        
    }
            
}
