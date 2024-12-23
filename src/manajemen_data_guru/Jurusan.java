/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemen_data_guru;

/**
 *
 * @author lenov
 */

public class Jurusan {
    private int idJurusan;
    private String namaJurusan;
    private int idSekolah;

    public Jurusan(int idJurusan, String namaJurusan, int idSekolah) {
        this.idJurusan = idJurusan;
        this.namaJurusan = namaJurusan;
        this.idSekolah = idSekolah;
    }

    // Getter 
    public int getIdJurusan() {
        return idJurusan; 
    }
    public String getNamaJurusan() {
        return namaJurusan; 
    }
    public int getIdSekolah() {
        return idSekolah; 
    }
    
    //Setter
    public void setIdJurusan(int idJurusan) {
        this.idJurusan = idJurusan; 
    }
    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan; 
    }
    public void setIdSekolah(int idSekolah) {
        this.idSekolah = idSekolah; 
    }
}

