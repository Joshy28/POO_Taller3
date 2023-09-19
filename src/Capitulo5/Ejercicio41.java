/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Capitulo5;

import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadDatos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de datos a comparar:"));
        
        if (cantidadDatos <= 0) {
            JOptionPane.showMessageDialog(null, "La cantidad de datos debe ser mayor que cero.");
            return;
        }

        double mayorValor = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= cantidadDatos; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el dato #" + i + ":");
            double valor = Double.parseDouble(input);

            if (valor < 0) {
                JOptionPane.showMessageDialog(null, "Ingrese solo valores positivos.");
                i--;
            } else {
                if (valor > mayorValor) {
                    mayorValor = valor;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "El mayor valor ingresado es: " + mayorValor);
    }
    
}
