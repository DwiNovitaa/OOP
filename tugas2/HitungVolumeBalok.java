/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author LENOVO
 */
public class HitungVolumeBalok {
    double Pj, Lb, Tg, Volume, LuasPermukaan;
    
    void SetPj(double npj){
        Pj = npj;
    }
    void SetLb(double nlb){
        Lb = nlb;
    }
    void SetTg(double ntg){
        Tg = ntg;
    }
    
    double GetPj(){
        return Pj;
    }
    double GetLb(){
        return Lb;
    }
    double GetTg(){
        return Tg;
    }
    
    double HtgVolume(){
        Volume = (Pj*Tg*Lb);
        return Volume;
    }
    double HtgLuasPermukaan(){
        LuasPermukaan = 2*(Pj*Lb+Pj*Tg+Lb*Tg);
        return LuasPermukaan;
    }
    
    void PrintHasil(){
        System.out.println("Hitung Volume Balok");
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Nilai Panjang : "+Pj);
        System.out.println("Nilai Lebar : "+Lb);
        System.out.println("Nilai Tinggi : "+Tg);
        System.out.println("Nilai Volume : "+Volume);
        System.out.println("Nilai Luas Permukaan : "+LuasPermukaan);
    }
}

