/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

/**
 *
 * @author LENOVO
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HitungVolumeBalok Htg = new HitungVolumeBalok();
        
        Htg.SetPj(3);
        Htg.SetLb(4);
        Htg.SetTg(5);
        double hsl = Htg.HtgVolume();
        double hsl2 = Htg.HtgLuasPermukaan();
        Htg.PrintHasil();
    }
    
}
