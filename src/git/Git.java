/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio2
 */
public class Git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO public static void main(String[] args) {
       int [] edad;
       edad= new int [10];
      /* double [] precio= new double[3];
       double total=0;
       for (int i=0; i < precio.length; i++)
       {
       precio [i]= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese una cantidad"));
               total+=precio[i];
       }
       JOptionPane.showMessageDialog(null,"el total es:"+total);
      }*/
      int seguir;
      String nombre;
      do{
      nombre=JOptionPane.showInputDialog("Ingrese un nombre:");
      JOptionPane.showMessageDialog(null,"Hola "+nombre);
      seguir=JOptionPane.showConfirmDialog(null, "¿Desea continuar?","confirmar",JOptionPane.YES_NO_OPTION);
      }
      while (seguir==JOptionPane.YES_OPTION);
    }
    
}
    
    
