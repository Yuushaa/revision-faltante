/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ver1_1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
/**
 *
 * @author Victor
 */
public class Usuario {
    private String nomUsuario;
    private String password;
    private int cveTipo;
    private String nombre;
    
    // Constructor
    
    public void Usuario(String strNomUsuario, String strPassword, 
            int nCveTipo, String strNombre) {
        this.nomUsuario = strNomUsuario;
        this.password = strPassword;
        this.cveTipo = nCveTipo;
        this.nombre = strNombre;
    }
    
    // Métodos SET
    
    public void setNomUsuario(String strNomUsuario) {
        this.nomUsuario = strNomUsuario;
    }
    
    public void setPassword(String strPassword) {
        this.password = strPassword;
    }
    
    public void setTipoUsuario(int nCveTipo) {
        this.cveTipo = nCveTipo;
    }
    
    public void setNombre(String strNombre) {
        this.nombre = strNombre;
    }
    
    // Métodos GET
    
    public String getNomUsuario() {
        return nomUsuario;
    }
    
    public String getPasswod() {
        return password;
    }
    
    public int getTipoUsuario() {
        return cveTipo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    // Método valida usuario
    public boolean validaUsuario(String strNomUsuario,char[] strPassword) 
    { 
        try {
            File archivo = new File("C:\\Users\\Victor\\Documents\\NetBeansProjects\\proyecto1.1\\src\\ver1_1\\Usuarios.txt");
            if(archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Victor\\Documents\\NetBeansProjects\\proyecto1.1\\src\\ver1_1\\Usuarios.txt"));
                String linea;
                while((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String nomUsuario = st.nextToken().trim();
                    String password = st.nextToken().trim();                    
                    char[] clave = password.toCharArray();
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "El archivo de usuarios no existe");
                return false;
            }
        
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error" + e);
            return false;
        }
        return true;
    }
}