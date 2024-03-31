/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;
import javax.swing.JOptionPane;

/**
 *
 * @author Vita
 * tgl : 31/03/24
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "";
        String b = "";
        double luas = 0;
        
        a = JOptionPane.showInputDialog("Masukkan tinggi segitiga");
        b = JOptionPane.showInputDialog("Masukkan alas segitiga");
        
        int tinggi = Integer.parseInt(a);
        int alas = Integer.parseInt(b);
        luas = (alas*tinggi)/2;
        System.out.println("Luas Segitiga adalah: "+luas);
        
        
        
    }
    
}
