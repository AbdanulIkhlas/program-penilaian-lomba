/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penilaian;

/**
 *
 * @author KLaZ
 */
public class HasilMenghitungNilai implements MenghitungNilai{
    private int nilai1,nilai2,nilai3,nilai4;
    public HasilMenghitungNilai(int param1, int param2, int param3, int param4) {
        // assigntment nilai parameter ke variabel
        this.nilai1 = param1;
        this.nilai2 = param2;
        this.nilai3 = param3;
        this.nilai4 = param4;
    }
    
    // override method2 abstrak dari interface MenghitungNilai()
    @Override
    public double infHitungNilaiKaryaTulis(){
        return (nilai1 * 0.15) + (nilai2 * 0.35) + (nilai3 * 0.25) + (nilai4 * 0.25);
    }

    @Override
    public double infHitungNilaiPuisi() {
        return (nilai1 * 0.30) + (nilai2 * 0.20) + (nilai3 * 0.20) + (nilai4 * 0.30);
    }  
}
