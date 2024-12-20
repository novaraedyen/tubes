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

    // Getter dan Setter
    public int getIdJurusan() { return idJurusan; }
    public void setIdJurusan(int idJurusan) { this.idJurusan = idJurusan; }

    public String getNamaJurusan() { return namaJurusan; }
    public void setNamaJurusan(String namaJurusan) { this.namaJurusan = namaJurusan; }

    public int getIdSekolah() { return idSekolah; }
    public void setIdSekolah(int idSekolah) { this.idSekolah = idSekolah; }
}
