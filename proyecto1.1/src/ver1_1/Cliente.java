/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ver1_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */

public class Cliente {
    private String nombre;
    private String direccion;
    private int noUs;
    
    public void mostrar()
    {
        try {
            File archivo = new File("C:\\Users\\Victor\\Documents\\NetBeansProjects\\proyecto1.1\\src\\ver1_1\\Clientes.txt");
            if(archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Victor\\Documents\\NetBeansProjects\\proyecto1.1\\src\\ver1_1\\Clientes.txt"));
                String linea;
                while((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String nombre = st.nextToken().trim();
                    String password = st.nextToken().trim();                    
                    char[] clave = password.toCharArray();
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "El archivo de usuarios no existe");
               
            }
        
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error" + e);
          
        }
    }
}
