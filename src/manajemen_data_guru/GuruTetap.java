/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemen_data_guru;

/**
 *
 * @author lenov
 */
public class GuruTetap extends Guru {
    private double gajiPokok;
    private String golongan;
    private double tunjangan;

    // Constructor
    public GuruTetap(String nama, String tanggalLahir, String jenisKelamin, String mataPelajaran, String statusGuru, int idGuru, 
                     double gajiPokok, String golongan, double tunjangan) {
        super(nama, tanggalLahir, jenisKelamin, statusGuru, mataPelajaran, idGuru); // memanggil constructor superclass
        this.gajiPokok = gajiPokok;
        this.golongan = golongan;
        this.tunjangan = tunjangan;
    }

    // Getter
    public double getGajiPokok() { 
        return gajiPokok; 
    }
    public String getGolongan() {
        return golongan; 
    }
    public double getTunjangan() {
        return tunjangan; 
    }
    
    //Setter
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok; 
    }
    public void setGolongan(String golongan) {
        this.golongan = golongan; 
    }
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan; 
    }
    
    // Metode khusus
    public double hitungGajiTotal() {
        return gajiPokok + tunjangan;
    }
}